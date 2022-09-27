package com.lbl.chatroom.netty.store;

import io.netty.channel.Channel;

import java.util.concurrent.ConcurrentHashMap;


public class UsernameToChannelStore {
    private static final ConcurrentHashMap<String, Channel> USERNAME_TO_CHANNEL_MAP = new ConcurrentHashMap<>();

    public static Channel getChannelByUsername(String username) {
        return USERNAME_TO_CHANNEL_MAP.get(username);
    }

    public static void storeChannel(String username, Channel channel) {
        USERNAME_TO_CHANNEL_MAP.put(username, channel);
    }

    public static void deleteChannelByUsername(String username) {
        USERNAME_TO_CHANNEL_MAP.remove(username);
    }
}
