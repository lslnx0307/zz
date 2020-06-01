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

    @PostMapping("/user/listUser")
    public BaseResult listUser(@RequestBody UserRequestVO userRequestVO) {
        return userService.listUser(userRequestVO);
    }

}
