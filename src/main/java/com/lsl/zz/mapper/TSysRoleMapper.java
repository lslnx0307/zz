package com.lsl.zz.mapper;

import com.lsl.zz.model.TSysRole;

public interface TSysRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TSysRole record);

    int insertSelective(TSysRole record);

    TSysRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSysRole record);

    int updateByPrimaryKey(TSysRole record);
}