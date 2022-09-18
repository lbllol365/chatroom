package com.lbl.chatroom.enums;

/**
 * 返回结果枚举
 * */
public enum ResultCode {
    SUCCESS(0, "成功")
    ;

    private final Integer code;
    private final String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
