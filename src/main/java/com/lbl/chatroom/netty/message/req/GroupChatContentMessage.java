package com.lbl.chatroom.netty.message.req;


/**
 *
 * 发送群聊消息
 * */
public class GroupChatContentMessage {
    private String fromUsername;

    private Integer groupId;

    private String content;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
