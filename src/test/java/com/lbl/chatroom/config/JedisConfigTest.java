package com.lbl.chatroom.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JedisConfigTest {

    @Autowired
    private Jedis jedis;

    @Test
    void getJedis() {
        jedis.set("kkkk","hello");
        String str = jedis.get("kkkk");
        Assertions.assertEquals("hello", str);
    }
}