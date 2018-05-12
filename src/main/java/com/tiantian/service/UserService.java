package com.tiantian.service;


import com.tiantian.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 查找用户列表，该方法只能超级管理员才能调用
     * @return
     */
    List<User> findAllUser();

    User findUserById(Long id);

}
