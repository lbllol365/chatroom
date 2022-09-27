package com.lbl.chatroom.netty.handler;

import com.lbl.chatroom.netty.message.req.InviteGroupMessage;
import com.lbl.chatroom.netty.message.res.InviteGroupResponseMessage;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.ArrayList;
import java.util.List;

@ChannelHandler.Sharable
public class InviteGroupHandler extends SimpleChannelInboundHandler<InviteGroupMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, InviteGroupMessage msg) throws Exception {
        if(null == msg.getGroupName() || null == msg.getNeedInviteUsername() || msg.getNeedInviteUsername().isEmpty()) {
            ctx.writeAndFlush(InviteGroupResponseMessage.PARAM_LACK);
            return;
        }

        // TODO 注入一个动态线程池来做业务逻辑处理
        List<String> successUsername = new ArrayList<>();


    }
}
