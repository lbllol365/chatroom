package com.lbl.chatroom.netty.handler;

import com.lbl.chatroom.config.RedisKey;
import com.lbl.chatroom.enums.ResultCode;
import com.lbl.chatroom.netty.message.req.LoginMessage;
import com.lbl.chatroom.netty.message.res.LoginResponseMessage;
import com.lbl.chatroom.netty.store.UsernameToChannelStore;
import com.lbl.chatroom.util.CommonUtil;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

@ChannelHandler.Sharable
@Service
public class LoginHandler extends SimpleChannelInboundHandler<LoginMessage> {

    @Autowired
    private Jedis jedis;

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LoginMessage msg) throws Exception {
        String userLoginInfoKey = RedisKey.USER_LOGIN + msg.getUsername();
        String passwordMD5;
        if(null == (passwordMD5 = jedis.get(userLoginInfoKey))) {
            ctx.writeAndFlush(LoginResponseMessage.NO_SUCH_USER);
        } else if(!passwordMD5.equals(CommonUtil.getMD5(msg.getPassword()))) {
            ctx.writeAndFlush(LoginResponseMessage.PASSWORD_NOT_MATCH);
        }
        UsernameToChannelStore.storeChannel(msg.getUsername(), ctx.channel());
        ctx.writeAndFlush(LoginResponseMessage.SUCCESS);
        // TODO 登录状态用bitmap实现？？
    }
}
