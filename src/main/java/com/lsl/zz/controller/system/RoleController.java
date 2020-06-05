package com.lsl.zz.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lsl.zz.VO.system.RoleRequestVO;
import com.lsl.zz.result.BaseResult;
import com.lsl.zz.service.system.ISysRoleService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author shiliang.li
 * @date 2020/6/3
 */
@Slf4j
@RestController(value = "角色")
public class RoleController {

    @Autowired
    private ISysRoleService sysRoleService;

    @PostMapping("/role/list")
    public BaseResult list(@RequestBody RoleRequestVO roleRequestVO) {
        return sysRoleService.roleList(roleRequestVO);
    }

    @PostMapping("/role/add")
    public BaseResult add(@RequestBody RoleRequestVO roleRequestVO) {
        return sysRoleService.addRole(roleRequestVO);
    }
}
