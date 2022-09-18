package com.lbl.chatroom.netty.handler;

import com.lbl.chatroom.config.RedisKey;
import com.lbl.chatroom.enums.ResultCode;
import com.lbl.chatroom.netty.message.req.RegisterMessage;
import com.lbl.chatroom.netty.message.res.RegisterResponseMessage;
import com.lbl.chatroom.util.CommonUtil;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

/**
 * 注册信息Handler
 * */
@ChannelHandler.Sharable
@Service
public class RegisterHandler extends SimpleChannelInboundHandler<RegisterMessage> {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Jedis jedis;

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, RegisterMessage msg) {
        try {
            String redisKey = RedisKey.USER_LOGIN + msg.getUsername();
            String passwordMD5 = CommonUtil.getMD5(msg.getPassword());
            jedis.set(redisKey, passwordMD5);
            ctx.writeAndFlush(new RegisterResponseMessage(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage()));
        } catch (Exception e) {
            logger.error("RegisterHandler-->channelRead0-->注册失败，异常", e);
            e.printStackTrace();
        }
    }
}
