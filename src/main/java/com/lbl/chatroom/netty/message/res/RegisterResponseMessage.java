package com.lbl.chatroom.netty.message.res;

import com.lbl.chatroom.enums.ResultCode;

public class RegisterResponseMessage extends ResponseMessage{

    public static final RegisterResponseMessage USERNAME_ALREADY_EXIST = new RegisterResponseMessage(ResultCode.USERNAME_ALREADY_EXIST.getCode(), ResultCode.USERNAME_ALREADY_EXIST.getMessage());

    public RegisterResponseMessage(Integer code, String message) {
        super(code, message);
    }


}
