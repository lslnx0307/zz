package com.lsl.zz.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author shiliang.li
 * @date 2020/5/27
 */
@Getter
@AllArgsConstructor
public enum ResponseCodeEnum {
    SUCCESS("00000", "处理成功"),
    FAIL("00001","处理失败"),
    SYSTEM_EXCEPTION("99999", "系统异常");
    private String code;
    private String msg;

}
