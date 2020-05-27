package com.lsl.zz.mapper;

import com.lsl.zz.model.TSysResource;

public interface TSysResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TSysResource record);

    int insertSelective(TSysResource record);

    TSysResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSysResource record);

    int updateByPrimaryKey(TSysResource record);
}