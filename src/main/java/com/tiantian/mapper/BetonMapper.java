package com.tiantian.mapper;


import com.tiantian.pojo.Beton;

public interface BetonMapper {
    int deleteByPrimaryKey(Long boId);

    int insert(Beton record);

    int insertSelective(Beton record);

    Beton selectByPrimaryKey(Long boId);

    int updateByPrimaryKeySelective(Beton record);

    int updateByPrimaryKey(Beton record);
}