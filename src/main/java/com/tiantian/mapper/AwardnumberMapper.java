package com.tiantian.mapper;


import com.tiantian.pojo.Awardnumber;

public interface AwardnumberMapper {
    int deleteByPrimaryKey(Long anId);

    int insert(Awardnumber record);

    int insertSelective(Awardnumber record);

    Awardnumber selectByPrimaryKey(Long anId);

    int updateByPrimaryKeySelective(Awardnumber record);

    int updateByPrimaryKey(Awardnumber record);
}