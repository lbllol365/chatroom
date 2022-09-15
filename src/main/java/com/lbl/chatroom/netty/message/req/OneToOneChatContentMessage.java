package com.lbl.chatroom.netty.message.req;


/**
 *
 * 单聊消息
 * */
public class OneToOneChatContentMessage {
    private String fromUsername;

    private String toUsername;

    private String content;

    public String getFromUsername() {
        return fromUsername;
    }

    public void setFromUsername(String fromUsername) {
        this.fromUsername = fromUsername;
    }

    public String getToUsername() {
        return toUsername;
    }

    public void setToUsername(String toUsername) {
        this.toUsername = toUsername;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
