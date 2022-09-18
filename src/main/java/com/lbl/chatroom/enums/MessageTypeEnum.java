package com.lbl.chatroom.enums;

import com.lbl.chatroom.netty.message.req.*;

public enum MessageTypeEnum {
    UNKNOWN(-1, Object.class),
    LOGIN(1, LoginMessage.class),
    CREATE_GROUP(2, CreateGroupMessage.class),
    ONETOONE_CHAT(3, OneToOneChatContentMessage.class),
    GROUP_CAHT(4, GroupChatContentMessage.class),
    INVITE_GROUP(5, InviteGroupMessage.class),
    JOIN_GROUP(6, JoinGroupMessage.class),
    REGISTER(7, RegisterMessage.class)
    ;


    private Integer typeCode;
    private Class<?> typeClass;

    MessageTypeEnum(Integer typeCode, Class<?> typeClass) {
        this.typeCode = typeCode;
        this.typeClass = typeClass;
    }

    public Integer getTypeCode() {
        return typeCode;
    }

    public Class<?> getTypeClass() {
        return typeClass;
    }

    public static Class<?> parseMessageType(int typeCode) {
        for(MessageTypeEnum item : MessageTypeEnum.values()) {
            if(item.getTypeCode() == typeCode) {
                return item.getTypeClass();
            }
        }
        return UNKNOWN.getTypeClass();
    }
}
