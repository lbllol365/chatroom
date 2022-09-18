package com.lbl.chatroom.netty.message.res;

public class RegisterResponseMessage extends ResponseMessage{

    public RegisterResponseMessage(Integer code, String message) {
        super(code, message);
    }
}
