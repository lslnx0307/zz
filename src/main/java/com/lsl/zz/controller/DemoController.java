package com.lsl.zz.controller;

import com.lsl.zz.result.BaseResult;
import com.lsl.zz.result.ResponseCodeEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shiliang.li
 * @date 2020/5/27
 */
@RestController
public class DemoController {

    @GetMapping("/demo")
    public BaseResult<String> demo() {
        BaseResult baseResult = BaseResult.builder().success(true).msg(ResponseCodeEnum.SUCCESS.getMsg())
                .code(ResponseCodeEnum.SUCCESS.getCode()).build();
        return baseResult;
    }
}
