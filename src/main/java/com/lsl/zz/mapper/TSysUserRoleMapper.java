package com.lsl.zz.mapper;

import com.lsl.zz.model.TSysUserRole;

public interface TSysUserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TSysUserRole record);

    int insertSelective(TSysUserRole record);

    TSysUserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSysUserRole record);

    int updateByPrimaryKey(TSysUserRole record);
}