package com.tiantian.mapper;


import com.tiantian.pojo.Message;

public interface MessageMapper {

    int deleteByPrimaryKey(Long mId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Long mId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}