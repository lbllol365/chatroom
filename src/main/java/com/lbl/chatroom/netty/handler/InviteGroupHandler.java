package com.lbl.chatroom.netty.handler;

import com.lbl.chatroom.netty.message.req.InviteGroupMessage;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
@ChannelHandler.Sharable
public class InviteGroupHandler extends SimpleChannelInboundHandler<InviteGroupMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, InviteGroupMessage msg) throws Exception {
        // TODO 邀请加群逻辑
    }
}
