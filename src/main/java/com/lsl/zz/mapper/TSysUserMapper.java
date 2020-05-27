package com.lsl.zz.mapper;

import com.lsl.zz.model.TSysUser;

public interface TSysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TSysUser record);

    int insertSelective(TSysUser record);

    TSysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSysUser record);

    int updateByPrimaryKey(TSysUser record);
}