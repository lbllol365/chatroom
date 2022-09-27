package com.lbl.chatroom.netty.handler;

import com.lbl.chatroom.netty.message.req.CreateGroupMessage;
import com.lbl.chatroom.netty.message.res.CreateGroupResponseMessage;
import com.lbl.chatroom.netty.store.GroupnameToChannelGroupStore;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

@ChannelHandler.Sharable
public class CreateGroupHandler extends SimpleChannelInboundHandler<CreateGroupMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, CreateGroupMessage msg) throws Exception {
        GroupnameToChannelGroupStore.createGroup(msg.getGroupName());
        ctx.writeAndFlush(CreateGroupResponseMessage.SUCCESS);
        // TODO 创建群聊逻辑
    }
}
