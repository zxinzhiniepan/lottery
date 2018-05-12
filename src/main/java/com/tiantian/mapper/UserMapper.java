package com.tiantian.mapper;


import com.tiantian.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * 根据用户id删除用户
     * @param uId
     * @return
     */
    int deleteByPrimaryKey(Long uId);

    /**
     * 插入一个新的用户，所有字段
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 选择性插入字段，只插入不为空的字段
     * @param user
     * @return
     */
    int insertSelective(User user);

    /**
     * 根据用户id查找用户所有字段
     * @param uId
     * @return
     */
    User selectByPrimaryKey(Long uId);

    /**
     * 根据用户账号查找用户所有字段
     * @param name
     * @return
     */
    User selectByName(String name);

    /**
     * 查找所有用户，所有字段
     * @return
     */
    List<User> selectAll();

    /**
     * 选择性更新，只更新不为空的字段，空字段不插入
     * @param user
     * @return
     */
    int updateByPrimaryKeySelective(User user);

    /**
     * 更新所有字段，空字段将会更新数据
     * @param user
     * @return
     */
    int updateByPrimaryKey(User user);
}