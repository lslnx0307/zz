package com.lsl.zz.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lsl.zz.VO.system.UserRequestVO;
import com.lsl.zz.result.BaseResult;
import com.lsl.zz.service.system.ISysUserService;

/**
 * sys_user controller
 * 
 * @author shiliang.li
 * @date 2020/6/1
 */
@RestController
public class UserController {

    @Autowired
    private ISysUserService userService;

    @PostMapping("/user/list")
    public BaseResult list(@RequestBody UserRequestVO userRequestVO) {
        return userService.listUser(userRequestVO);
    }

    @PostMapping("/user/add")
    public BaseResult add(@RequestBody UserRequestVO userRequestVO) {
        return userService.addUser(userRequestVO);
    }

}
