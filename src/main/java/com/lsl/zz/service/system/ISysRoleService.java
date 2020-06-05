package com.lsl.zz.service.system;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lsl.zz.VO.PageInfo;
import com.lsl.zz.VO.system.RoleRequestVO;
import com.lsl.zz.mapper.TSysRoleMapper;
import com.lsl.zz.model.TSysRole;
import com.lsl.zz.result.BaseResult;

/**
 * 角色service
 * @author shiliang.li
 * @date 2020/6/1
 */
@Service
public class ISysRoleService {

    @Resource
    private TSysRoleMapper tSysRoleMapper;

    public BaseResult<PageInfo> roleList(RoleRequestVO roleRequestVO) {
        roleRequestVO.parsePage();
        List<TSysRole> roleList = tSysRoleMapper.listRole(roleRequestVO);
        Integer countRole = tSysRoleMapper.countRole(roleRequestVO);
        return BaseResult.success(new PageInfo(roleList, countRole));
    }

    @Transactional
    public BaseResult addRole(RoleRequestVO roleRequestVO) {
        TSysRole tSysRole = new TSysRole();
        tSysRole.setRoleName(roleRequestVO.getRoleName());
        int addFlag = tSysRoleMapper.insertSelective(tSysRole);
        return addFlag == 1 ? BaseResult.success("角色添加成功") : BaseResult.success("角色添加失败");
    }
}
