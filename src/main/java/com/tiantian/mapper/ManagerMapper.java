package com.tiantian.mapper;


import com.tiantian.pojo.Manager;

public interface
ManagerMapper {
    int deleteByPrimaryKey(Long mId);

    int insert(Manager record);

    int insertSelective(Manager record);

    Manager selectByPrimaryKey(Long mId);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKey(Manager record);
}