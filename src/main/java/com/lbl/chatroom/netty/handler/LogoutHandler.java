package com.lbl.chatroom.netty.handler;

import com.lbl.chatroom.config.RedisKey;
import com.lbl.chatroom.netty.message.req.LogoutMessage;
import com.lbl.chatroom.netty.message.res.LogoutResponseMessage;
import com.lbl.chatroom.netty.store.UsernameToChannelStore;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;


@ChannelHandler.Sharable
@Service
public class LogoutHandler extends SimpleChannelInboundHandler<LogoutMessage> {

    @Autowired
    private Jedis jedis;


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LogoutMessage msg) throws Exception {
        String userLoginInfoKey = RedisKey.USER_LOGIN + msg.getUsername();
        jedis.del(userLoginInfoKey);
        UsernameToChannelStore.deleteChannelByUsername(msg.getUsername());
        ctx.writeAndFlush(LogoutResponseMessage.SUCCESS);
    }
}
