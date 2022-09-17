package com.lbl.chatroom.netty.handler;

import com.lbl.chatroom.netty.message.req.JoinGroupMessage;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

@ChannelHandler.Sharable
public class JoinGroupHandler extends SimpleChannelInboundHandler<JoinGroupMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, JoinGroupMessage msg) throws Exception {
        // TODO 加入群聊逻辑
    }
}
