package com.lbl.chatroom.enums;

/**
 * 返回结果枚举
 * */
public enum ResultCode {
    SUCCESS(0, "成功"),
    NO_SUCH_USER(9000, "没有此用户，请注册"),
    PASSWORD_NOT_MATCH(9001, "用户名密码不匹配"),
    USERNAME_ALREADY_EXIST(9002, "用户名已经存在")
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
