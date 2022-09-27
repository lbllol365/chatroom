package com.lbl.chatroom.netty.message.res;

import com.lbl.chatroom.enums.ResultCode;

public class LogoutResponseMessage extends ResponseMessage{
    public LogoutResponseMessage(Integer code, String message) {
        super(code, message);
    }

    public LogoutResponseMessage() {
    }

    public static final LogoutResponseMessage SUCCESS = new LogoutResponseMessage(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage());
}
