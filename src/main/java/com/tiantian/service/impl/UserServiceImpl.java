package com.tiantian.service.impl;

import com.tiantian.mapper.UserMapper;
import com.tiantian.pojo.User;
import com.tiantian.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.regex.Pattern;

@Service
public class UserServiceImpl implements UserService{
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(readOnly = true)
    public List<User> findAllUser() {
        return userMapper.selectAll();
    }

    @Override
    @Transactional(readOnly = true)
    public User findUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 查找管理员下线用户，返回部分信息
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public User findUserSomeInfo(User currentUser,User findUser) throws Exception {
        if(findUser.getuName() == null){
            //当查找对象的uId为空时抛出异常
            throw new Exception("findUser对象的uName不能为空");
        }
        //判断当前用户是否是管理员
        if(currentUser.getManager().getmId() != null){
            log.info("管理员" + currentUser.getuName() + "查看了用户");
            return userMapper.selectUserSomeInfo(currentUser,findUser);
        }else{
            log.error("只有管理员才有权限执行此操作");
            throw new Exception("只有管理员才有权限执行此操作");
        }
    }

    /**
     * 查找下线用户列表，返回部分信息
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public List<User> findUserSomeInfoList(User currentUser) throws Exception {
        //判断当前用户是否是管理员
        if(currentUser.getManager().getmId() != null){
            log.info("管理员" + currentUser.getuName() + "查看了下线用户");
            return userMapper.selectUserSomeInfoList(currentUser);
        }else{
            log.error("只有管理员才有权限执行此操作");
            throw new Exception("只有管理员才有权限执行此操作");
        }
    }

    /**
     * 用户登录
     * @param user
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public User login(User user) {
        User currentUser = null;
        if(user.getuName() == null || user.getuPassword() == null){
            return null;
        }else{
            log.info("++++++++++++++账号密码不为空，查询用户");
            currentUser = userMapper.selectUserByAccountAndPwd(user);
            return currentUser;
        }
    }

    /**
     * 管理员登录
     * @param user
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public User managerLogin(User user) {
        User currentUser = null;
        if(user.getuName() == null || user.getuPassword() == null){
            return null;
        }else{
            log.info("++++++++++++++账号密码不为空，查询用户");
            currentUser = userMapper.selectUserByAccountAndPwd(user);
            //mId 不为空是管理员，mId为空是普通用户
            if(currentUser != null && currentUser.getManager().getmId() != null){
                log.info(currentUser.getuName() + "管理员登录系统");
                return currentUser;
            }else{
                return null;
            }
        }
    }

    /**
     * 用户注册
     * @param user
     * @return 注册成功返回true失败返回false
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean register(User user) {
        String uNameTest = "[a-zA-Z0-9_]{6,10}";
        String uPasswordTest = "[a-zA-Z0-9_]{6,10}";
        boolean bl = Pattern.compile(uNameTest).matcher(user.getuName()).matches();
        boolean b2 = Pattern.compile(uPasswordTest).matcher(user.getuPassword()).matches();
        Double balance = user.getBalance();
        if(balance == null || balance != 0){
            user.setBalance(0.00);
        }
        if(bl && b2){
            //账号密码合法
            return userMapper.insertSelective(user) == 1 ? true:false;
        }
        return false;
    }




}
