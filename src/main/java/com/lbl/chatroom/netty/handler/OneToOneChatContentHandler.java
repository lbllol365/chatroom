package com.lbl.chatroom.netty.handler;

import com.lbl.chatroom.netty.message.req.OneToOneChatContentMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class OneToOneChatContentHandler extends SimpleChannelInboundHandler<OneToOneChatContentMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, OneToOneChatContentMessage msg) throws Exception {
        // TODO 单聊逻辑
    }
}
