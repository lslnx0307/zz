package com.lsl.zz.mapper;

import java.util.List;

import com.lsl.zz.VO.system.UserRequestVO;
import com.lsl.zz.VO.system.UserResponseVO;
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
    UserResponseVO getUserInfoByUserName(String loginAccount);

    /**
     * 用户列表
     * @param userRequestVO
     * @return
     */
    List<UserResponseVO> listUser(UserRequestVO userRequestVO);

    /**
     * 用户列表的count
     * @param userRequestVO
     * @return
     */
    Integer countUser(UserRequestVO userRequestVO);
}