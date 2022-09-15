package com.lbl.chatroom.controller;


import com.lbl.chatroom.service.ChatRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ChatRoomController {

    @Autowired
    private ChatRoomService chatRoomService;

    @GetMapping("listAllChatRoom")
    public Map<String, Object> listAllChatRoom() {
        return chatRoomService.listAllChatRoom();
    }

    @PostMapping("joinChatRoom")
    public Map<String, Object> joinChatRoom() {
        return chatRoomService.joinChatRoom();
    }

    @PostMapping("createChatMap")
    public Map<String, Object> createChatMap() {
        return chatRoomService.createChatMap();
    }

    @PostMapping("postMessage")
    public Map<String, Object> postMessage() {
        return chatRoomService.postMessage();
    }
}
