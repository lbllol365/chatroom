package com.lbl.chatroom.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonUtilTest {

    @Test
    void getMD5() {
        String str = "hello world";
        System.out.println(CommonUtil.getMD5(str));
    }
}