package com.lbl.chatroom.netty.message.req;

import java.util.List;

public class InviteGroupMessage {
    private String fromUsername;

    private List<String> needInviteUsername;

    public String getFromUsername() {
        return fromUsername;
    }

    public void setFromUsername(String fromUsername) {
        this.fromUsername = fromUsername;
    }

    public List<String> getNeedInviteUsername() {
        return needInviteUsername;
    }

    public void setNeedInviteUsername(List<String> needInviteUsername) {
        this.needInviteUsername = needInviteUsername;
    }
}
