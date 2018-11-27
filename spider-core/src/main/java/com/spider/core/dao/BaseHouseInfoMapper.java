package com.spider.core.dao;

import com.spider.core.model.BaseHouseInfo;

public interface BaseHouseInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BaseHouseInfo record);

    int insertSelective(BaseHouseInfo record);

    BaseHouseInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaseHouseInfo record);

    int updateByPrimaryKey(BaseHouseInfo record);
}