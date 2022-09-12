package com.lbl.chatroom.vo;

import java.util.concurrent.atomic.AtomicInteger;

public class ChatRoom {
    private Integer id;

    private AtomicInteger onlineNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOnlineNum() {
        return this.onlineNum.get();
    }

    public void setOnlineNum(Integer oldVal, Integer newVal) {
        this.onlineNum.compareAndSet(oldVal, newVal);
    }
}
