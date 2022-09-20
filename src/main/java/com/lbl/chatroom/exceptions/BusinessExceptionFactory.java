package com.lbl.chatroom.exceptions;

import com.lbl.chatroom.enums.ResultCode;

public class BusinessExceptionFactory {
    // 群已经存在
    public static final BusinessException GROUP_NAME_ALREADY_EXIST = new BusinessException(ResultCode.GROUP_NAME_ALREADY_EXIST.getCode(), ResultCode.GROUP_NAME_ALREADY_EXIST.getMessage());
    // 群不存在
    public static final BusinessException NO_SUCH_GROUP = new BusinessException(ResultCode.NO_SUCH_GROUP.getCode(), ResultCode.NO_SUCH_GROUP.getMessage());
}
