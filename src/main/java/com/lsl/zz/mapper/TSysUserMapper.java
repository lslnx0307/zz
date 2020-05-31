package com.lsl.zz.mapper;

import com.lsl.zz.VO.system.UserVO;
import com.lsl.zz.model.TSysUser;

public interface TSysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TSysUser record);

    int insertSelective(TSysUser record);

    TSysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSysUser record);

    int updateByPrimaryKey(TSysUser record);

    /**
     * 根据用户名查询用户信息
     * @param loginAccount
     * @return
     */
    UserVO getUserInfoByUserName(String loginAccount);
}