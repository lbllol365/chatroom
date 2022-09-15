package com.lbl.chatroom.netty.handler;

import com.lbl.chatroom.netty.message.req.CreateGroupMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class CreateGroupHandler extends SimpleChannelInboundHandler<CreateGroupMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, CreateGroupMessage msg) throws Exception {
        // TODO 创建群聊逻辑
    }
}
