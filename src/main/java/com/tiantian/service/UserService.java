package com.tiantian.service;


import com.tiantian.pojo.User;

import java.util.List;

public interface UserService {
    /**
     *
     * @return
     */
    List<User> findAllUser();

    User findUserById(Long id);

    /**
     * 根据账号查找指定用户，该用户必须是当前管理员的下线，否则返回null，uId,uName,balance,uTime,uLeaderName邀请人账号 返回指定用户，该方法将校验用户是否是管理员，非管理员抛出异常
     * @param currentUser 执行当前操作的对象，及当前登录的对象
     * @param findUser  需要查找的对象，该对象的uName为需要参数不能为空，当uName为空时抛出异常
     * @return
     * @throws Exception
     */
    User findUserSomeInfo(User currentUser,User findUser) throws Exception;

    /**
     * 查找该管理员下线用户列表，uId,uName,balance,uTime,uLeaderName邀请人账号 返回用户列表，该方法将校验用户是否是管理员，非管理员抛出异常
     * @return
     */
    List<User> findUserSomeInfoList(User currentUser) throws Exception;

    /**
     * 用户登录，校验账号密码是否正确，账号密码正确返回一个用户对象，账号或密码有误返回null
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 管理员登录，校验账号密码是否正确，账号密码正确，校验对象id是否在管理员中，校验通过返回管理员对象，账号或密码有误返回null
     * @param user
     * @return
     */
    User managerLogin(User user);

    /**
     * 注册一个新的用户，uName,uPassword,uTime,balance属性不能为空，uName:账号为0-9，a-zA-Z，下划线组合、长度6-16，uPassword:密码0-9，a-zA-Z，下划线组合、长度6-16，balance必须为0，不为0或为空将初始化为0
     * @param user
     * @return  注册成功返回true,失败返回false
     */
    boolean register(User user);

}
