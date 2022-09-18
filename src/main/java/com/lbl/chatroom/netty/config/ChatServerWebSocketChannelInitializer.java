package com.lbl.chatroom.netty.config;

import com.lbl.chatroom.netty.codec.TextFrameToMessageDecoder;
import com.lbl.chatroom.netty.handler.*;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier("chatServerWebSocketChannelInitializer")
public class ChatServerWebSocketChannelInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast(new HttpServerCodec());
        pipeline.addLast(new HttpObjectAggregator(65536));
        pipeline.addLast(new ChunkedWriteHandler());
        pipeline.addLast(new WebSocketServerProtocolHandler("/ws", null, false, Integer.MAX_VALUE, false));
        pipeline.addLast(new TextFrameToMessageDecoder());
        pipeline.addLast(new CreateGroupHandler());
        pipeline.addLast(new GroupChatContentHandler());
        pipeline.addLast(new InviteGroupHandler());
        pipeline.addLast(new JoinGroupHandler());
        pipeline.addLast(new LoginHandler());
        pipeline.addLast(new OneToOneChatContentHandler());
    }
}
