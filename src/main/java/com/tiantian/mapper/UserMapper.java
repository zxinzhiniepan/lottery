package com.tiantian.mapper;


import com.tiantian.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * 根据用户id删除用户
     *
     * @param uId
     * @return
     */
    int deleteByPrimaryKey(Long uId);

    /**
     * 插入一个新的用户，所有字段
     *
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 选择性插入字段，只插入不为空的字段
     *
     * @param user
     * @return
     */
    int insertSelective(User user);

    /**
     * 根据用户id查找用户所有字段
     *
     * @param uId
     * @return
     */
    User selectByPrimaryKey(Long uId);

    /**
     * 根据用户账号查找用户所有字段
     *
     * @param name
     * @return
     */
    User selectByName(String name);

    /**
     * 查找所有用户，所有字段
     *
     * @return
     */
    List<User> selectAll();

    /**
     * 根据id查询下线用户uId,uName,balance,uTime,uLeaderName邀请人账号，该方法只能查询到属于当前管理员下线的用户
     * @param currentUser   当前登录的用户
     * @param findUser  需要查找的用户，该用户uId不能为空
     * @return
     */
    User selectUserSomeInfo(@Param("currentUser")User currentUser,@Param("findUser") User findUser);

    /**
     * 查询当前管理员的所有下线用户uId,uName,balance,uTime,uLeaderName邀请人账号 返回用户列表，该方法只能查询到属于当前管理员下线的用户
     *
     * @return
     */
    List<User> selectUserSomeInfoList(@Param("currentUser")User currentUser);

    /**
     * 根据id可查询任意用户的
     * @param currentUser
     * @param findUser
     * @return
     */
    User selectAllUserSomeInfo(@Param("currentUser")User currentUser,@Param("findUser") User findUser);

    /**
     * 根据用户账号和用户密码查询用户
     * @param user
     * @return
     */
    User selectUserByAccountAndPwd(@Param("user") User user);

    /**
     * 选择性更新，只更新不为空的字段，空字段不插入
     *
     * @param user
     * @return
     */
    int updateByPrimaryKeySelective(User user);

    /**
     * 更新所有字段，空字段将会更新数据
     *
     * @param user
     * @return
     */
    int updateByPrimaryKey(User user);
}