package com.lsl.zz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lsl.zz.result.BaseResult;
import com.lsl.zz.result.ResponseCodeEnum;

import lombok.extern.slf4j.Slf4j;

/**
 * @author shiliang.li
 * @date 2020/5/27
 */
@RestController
@Slf4j
public class DemoController {

    @GetMapping("/demo")
    public BaseResult<String> demo() {
        BaseResult baseResult = BaseResult.builder().success(true).msg(ResponseCodeEnum.SUCCESS.getMsg())
                .code(ResponseCodeEnum.SUCCESS.getCode()).build();
        return baseResult;
    }
}
