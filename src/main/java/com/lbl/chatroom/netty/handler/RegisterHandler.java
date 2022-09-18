package com.lbl.chatroom.netty.handler;

import com.lbl.chatroom.netty.message.req.RegisterMessage;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

@ChannelHandler.Sharable
public class RegisterHandler extends SimpleChannelInboundHandler<RegisterMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, RegisterMessage msg) throws Exception {

    }
}
