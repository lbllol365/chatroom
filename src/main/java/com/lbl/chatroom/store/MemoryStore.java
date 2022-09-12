package com.lbl.chatroom.store;

import com.lbl.chatroom.vo.ChatRoom;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryStore {
    private static Map<Integer, ChatRoom> CHATROOM_MAP = new ConcurrentHashMap<>();

    public static ChatRoom getChatRoom(Integer id) {
        return CHATROOM_MAP.get(id);
    }

    public static void setChatRoom(Integer id, ChatRoom room) {
        CHATROOM_MAP.put(id, room);
    }

    public static List<ChatRoom> getChatRoomList() {
        return (List<ChatRoom>) CHATROOM_MAP.values();
    }

}
