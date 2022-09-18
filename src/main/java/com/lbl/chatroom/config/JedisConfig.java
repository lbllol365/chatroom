package com.lbl.chatroom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

@Component
public class JedisConfig {

    @Bean
    public Jedis getJedis() {
        return new Jedis("127.0.0.1", 6379);
    }
}
