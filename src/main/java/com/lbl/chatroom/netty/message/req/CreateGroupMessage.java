package com.lbl.chatroom.netty.message.req;


/**
 * 创建群聊消息
 * */
public class CreateGroupMessage {
    private String fromUsername;

    public String getFromUsername() {
        return fromUsername;
    }

    public void setFromUsername(String fromUsername) {
        this.fromUsername = fromUsername;
    }
}
