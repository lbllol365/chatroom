package com.lbl.chatroom.netty.handler;

import com.lbl.chatroom.netty.message.req.GroupChatContentMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class GroupChatContentHandler extends SimpleChannelInboundHandler<GroupChatContentMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, GroupChatContentMessage msg) throws Exception {
        // TODO 群聊逻辑
    }
}
