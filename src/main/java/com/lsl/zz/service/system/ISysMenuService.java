package com.lsl.zz.service.system;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lsl.zz.VO.PageInfo;
import com.lsl.zz.VO.system.MenuRequestVO;
import com.lsl.zz.mapper.TSysResourceMapper;
import com.lsl.zz.model.TSysResource;
import com.lsl.zz.result.BaseResult;

import lombok.extern.slf4j.Slf4j;

/**
 * 菜单service
 * @author shiliang.li
 * @date 2020/6/1
 */
@Slf4j
@Service
public class ISysMenuService {

    @Autowired
    private TSysResourceMapper tSysResourceMapper;

    /**
     * 菜单列表
     * @param requestVO
     * @return
     */
    public BaseResult<PageInfo> listMenu(MenuRequestVO requestVO){
        requestVO.parsePage();
        List<TSysResource> resourceList = tSysResourceMapper.listMenu(requestVO);
        Integer countMenu = tSysResourceMapper.countMenu(requestVO);
        return BaseResult.success(new PageInfo(resourceList, countMenu));
    }

    /**
     *
     * @param requestVO
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public BaseResult addMenu(MenuRequestVO requestVO) {
        TSysResource tSysResource = new TSysResource();
        BeanUtils.copyProperties(requestVO, tSysResource);
        int addFlag = tSysResourceMapper.insertSelective(tSysResource);
        return addFlag == 1 ? BaseResult.success("菜单添加成功") : BaseResult.success("菜单添加失败");
    }
}
