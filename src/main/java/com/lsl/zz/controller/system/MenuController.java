package com.lsl.zz.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lsl.zz.VO.system.MenuRequestVO;
import com.lsl.zz.result.BaseResult;
import com.lsl.zz.service.system.ISysMenuService;

import lombok.extern.slf4j.Slf4j;

/**
 * 菜单的controller
 * 
 * @author shiliang.li
 * @date 2020/6/1
 */
@Slf4j
@RestController(value = "menu")
public class MenuController {

    @Autowired
    private ISysMenuService sysMenuService;

    @PostMapping("/menu/list")
    public BaseResult list(@RequestBody MenuRequestVO requestVO) {
        return sysMenuService.listMenu(requestVO);
    }

    @PostMapping("/menu/add")
    public BaseResult add(@RequestBody MenuRequestVO requestVO) {
        return sysMenuService.addMenu(requestVO);
    }
}
