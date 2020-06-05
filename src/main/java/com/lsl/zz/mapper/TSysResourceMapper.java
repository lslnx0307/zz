package com.lsl.zz.mapper;

import java.util.List;

import com.lsl.zz.VO.system.MenuRequestVO;
import com.lsl.zz.model.TSysResource;

public interface TSysResourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TSysResource record);

    int insertSelective(TSysResource record);

    TSysResource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TSysResource record);

    int updateByPrimaryKey(TSysResource record);

    /**
     * 列表
     * @param requestVO
     * @return
     */
    List<TSysResource> listMenu(MenuRequestVO requestVO);
    /**
     * 列表个数
     * @param requestVO
     * @return
     */
    Integer countMenu(MenuRequestVO requestVO);
}