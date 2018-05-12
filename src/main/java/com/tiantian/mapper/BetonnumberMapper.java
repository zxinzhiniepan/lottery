package com.tiantian.mapper;


import com.tiantian.pojo.Betonnumber;

public interface BetonnumberMapper {
    int deleteByPrimaryKey(Long bonId);

    int insert(Betonnumber record);

    int insertSelective(Betonnumber record);

    Betonnumber selectByPrimaryKey(Long bonId);

    int updateByPrimaryKeySelective(Betonnumber record);

    int updateByPrimaryKey(Betonnumber record);
}