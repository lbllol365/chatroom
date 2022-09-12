package com.lbl.chatroom.service;

import com.lbl.chatroom.store.MemoryStore;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ChatRoomService {

    public Map<String, Object> listAllChatRoom() {
        Map<String, Object> resMap = new HashMap<>();
        MemoryStore.getChatRoomList();

    }

    public Map<String, Object> joinChatRoom() {
        return null;
    }

    public Map<String, Object> createChatMap() {
        return null;
    }

    public Map<String, Object> postMessage() {
        return null;
    }
}
