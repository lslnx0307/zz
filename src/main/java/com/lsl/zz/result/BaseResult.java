package com.lsl.zz.result;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

/**
 *
 * 响应数据模型
 * 
 * @author shiliang.li
 * @date 2020/5/27
 */
@Data
@Builder
public class BaseResult<T> implements Serializable {

    private static final long serialVersionUID = -3267985926875958356L;

    /**
     * 结果集
     */
    private T data;

    /**
     * 成功失败的标识
     */
    private boolean success;

    /**
     * 接口响应信息
     */
    private String msg;

    /**
     * 接口响应码
     */
    private String code;

    public static<T> BaseResult<T> success(T data) {
        BaseResult baseResult = new BaseResult(data, true, ResponseCodeEnum.SUCCESS.getCode(),
                ResponseCodeEnum.SUCCESS.getMsg());
        return baseResult;
    }

    public static<T> BaseResult<T> fail(T data) {
        BaseResult baseResult = new BaseResult(data, false, ResponseCodeEnum.FAIL.getCode(),
                ResponseCodeEnum.FAIL.getMsg());
        return baseResult;
    }

}
