package com.lbl.chatroom.netty.message.req;


/**
* 加群消息
* */
public class JoinGroupMessage {
    private String fromUsername;

    private Integer groupId;

    public String getFromUsername() {
        return fromUsername;
    }

    public void setFromUsername(String fromUsername) {
        this.fromUsername = fromUsername;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}
