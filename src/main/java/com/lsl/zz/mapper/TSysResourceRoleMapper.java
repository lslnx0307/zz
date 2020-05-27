package com.lsl.zz.mapper;

import com.lsl.zz.model.TSysResourceRole;

public interface TSysResourceRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TSysResourceRole record);

    int insertSelective(TSysResourceRole record);

    TSysResourceRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSysResourceRole record);

    int updateByPrimaryKey(TSysResourceRole record);
}