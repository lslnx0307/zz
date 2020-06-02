package com.lsl.zz.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lsl.zz.result.BaseResult;
import com.lsl.zz.result.ResponseCodeEnum;

import lombok.extern.slf4j.Slf4j;

/**
 * @author shiliang.li
 * @date 2020/6/2
 */
@ControllerAdvice
@ResponseBody
@Slf4j
public class ZzExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public BaseResult<String> exceptionhandler(HttpServletRequest request, Exception e) {
        log.error("全局异常统一捕捉{}", e);

        if (e instanceof ZzException) {
            ZzException zzException = (ZzException) e;
            return BaseResult.fail(zzException.getLocaleMessage());
        } else {
            return BaseResult.fail(ResponseCodeEnum.SYSTEM_EXCEPTION.getMsg());
        }
    }
}
