package com.lbl.chatroom.netty.store;

import com.lbl.chatroom.exceptions.BusinessExceptionFactory;
import io.netty.channel.Channel;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GroupnameToChannelGroupStore {
    private static final Map<String, ChannelGroup> GROUPNAME_TO_CHANNEL_GROUP_MAP = new ConcurrentHashMap<>();

    /**
     * 单个加群
     * */
    public static boolean addGroupMember(Channel channel, String groupName) {
        if(!GROUPNAME_TO_CHANNEL_GROUP_MAP.containsKey(groupName)) {
            throw BusinessExceptionFactory.NO_SUCH_GROUP;
        }
        return GROUPNAME_TO_CHANNEL_GROUP_MAP.get(groupName).add(channel);
    }

    /**
     * 批量加群
     * */
    public static boolean addAllGroupMember(Collection<Channel> channels, String groupName) {
        if(!GROUPNAME_TO_CHANNEL_GROUP_MAP.containsKey(groupName)) {
            throw BusinessExceptionFactory.NO_SUCH_GROUP;
        }
        return GROUPNAME_TO_CHANNEL_GROUP_MAP.get(groupName).addAll(channels);
    }

    /**
     * 创建群聊
     * */
    public static void createGroup(String groupName) {
        if(GROUPNAME_TO_CHANNEL_GROUP_MAP.containsKey(groupName)) {
            throw BusinessExceptionFactory.GROUP_NAME_ALREADY_EXIST;
        }
        GROUPNAME_TO_CHANNEL_GROUP_MAP.put(groupName, new DefaultChannelGroup(GlobalEventExecutor.INSTANCE));

    }
}
