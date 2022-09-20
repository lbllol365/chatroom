package com.lbl.chatroom.netty.message.req;


/**
 * 创建群聊消息
 * */
public class CreateGroupMessage {
    private String fromUsername;

    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getFromUsername() {
        return fromUsername;
    }

    public void setFromUsername(String fromUsername) {
        this.fromUsername = fromUsername;
    }
}
