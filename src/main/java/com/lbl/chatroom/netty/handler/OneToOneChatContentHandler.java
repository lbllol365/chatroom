package com.lbl.chatroom.netty.handler;

import com.lbl.chatroom.netty.message.req.OneToOneChatContentMessage;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
@ChannelHandler.Sharable
public class OneToOneChatContentHandler extends SimpleChannelInboundHandler<OneToOneChatContentMessage> {
    /**
     * 1.校验入参
     * 2.校验发送人是否在线
     * 3。发送信息
     * */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, OneToOneChatContentMessage msg) throws Exception {
        // TODO 单聊逻辑
    }
}
