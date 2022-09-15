package com.lbl.chatroom.netty.handler;

import com.lbl.chatroom.netty.message.req.LoginMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class LoginHandler extends SimpleChannelInboundHandler<LoginMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LoginMessage msg) throws Exception {
        // TODO 登录逻辑
    }
}
