package com.lbl.chatroom.netty.message.res;

import com.lbl.chatroom.enums.ResultCode;

public class LoginResponseMessage extends ResponseMessage{

    public LoginResponseMessage(Integer code, String message) {
        super(code, message);
    }

    public static final LoginResponseMessage SUCCESS = new LoginResponseMessage(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage());

    public static final LoginResponseMessage NO_SUCH_USER = new LoginResponseMessage(ResultCode.NO_SUCH_USER.getCode(), ResultCode.SUCCESS.getMessage());

    public static final LoginResponseMessage PASSWORD_NOT_MATCH = new LoginResponseMessage(ResultCode.PASSWORD_NOT_MATCH.getCode(), ResultCode.PASSWORD_NOT_MATCH.getMessage());

}
