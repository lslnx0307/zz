package com.lsl.zz.mapper;

import java.util.List;

import com.lsl.zz.VO.system.RoleRequestVO;
import com.lsl.zz.model.TSysRole;

public interface TSysRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TSysRole record);

    int insertSelective(TSysRole record);

    TSysRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSysRole record);

    int updateByPrimaryKey(TSysRole record);

    /**
     * 列表
     * @param roleRequestVO
     * @return
     */
    List<TSysRole> listRole(RoleRequestVO roleRequestVO);

    /**
     * 总数
     * @param roleRequestVO
     * @return
     */
    Integer countRole(RoleRequestVO roleRequestVO);
}