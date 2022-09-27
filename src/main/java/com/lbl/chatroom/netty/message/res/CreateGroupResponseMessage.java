package com.lbl.chatroom.netty.message.res;

import com.lbl.chatroom.enums.ResultCode;

public class CreateGroupResponseMessage extends ResponseMessage{
    public CreateGroupResponseMessage(Integer code, String message) {
        super(code, message);
    }

    public static final CreateGroupResponseMessage SUCCESS = new CreateGroupResponseMessage(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage());
}
