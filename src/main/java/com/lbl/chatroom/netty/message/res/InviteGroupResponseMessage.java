package com.lbl.chatroom.netty.message.res;

import com.lbl.chatroom.enums.ResultCode;

import java.util.List;

public class InviteGroupResponseMessage extends ResponseMessage{
    private List<String> successUsernameList;

    public InviteGroupResponseMessage(Integer code, String message, List<String> successUsernameList) {
        super(code, message);
        this.successUsernameList = successUsernameList;
    }

    public static InviteGroupResponseMessage GET_SUCCESS(List<String> usernameList) {
        return new InviteGroupResponseMessage(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), usernameList);
    }

    public static final InviteGroupResponseMessage PARAM_LACK = new InviteGroupResponseMessage(ResultCode.PARAM_LACK.getCode(), ResultCode.PARAM_LACK.getMessage(), null);
}
