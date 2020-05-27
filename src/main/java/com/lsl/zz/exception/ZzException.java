package com.lsl.zz.exception;

import lombok.Getter;

/**
 * 自定义异常
 * 
 * @author shiliang.li
 * @date 2020/5/27
 */
public class ZzException extends RuntimeException {

    @Getter
    private final Object[] localeArgs;

    @Getter
    private final String localeMessage;

    public ZzException(String localeMessage, String message) {
        super(message);
        this.localeArgs = new Object[0];
        this.localeMessage = localeMessage;
    }

    public ZzException(String localeMessage, Object[] localeArgs, String message) {
        super(message);
        this.localeArgs = localeArgs;
        this.localeMessage = localeMessage;
    }

    @Override
    public Throwable fillInStackTrace() {
        return null;
    }

    public Throwable doFillInStackTrace() {
        return super.fillInStackTrace();
    }
}
