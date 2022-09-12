package com.lbl.chatroom.netty.config;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;

@Component
public class ChatServerConfig {
    @Value("${chat.server.port}")
    private Integer serverPort;

    @Value("${chat.server.bossCount}")
    private Integer bossCount;

    @Value("${chat.server.workerCount}")
    private Integer workerCount;

    @Autowired
    private ChatServerWebSocketChannelInitializer serverChannelInitializer;

    @Bean(name = "serverBootstrap")
    public ServerBootstrap bootstrap(NioEventLoopGroup bossGroup, NioEventLoopGroup workerGroup,
                                     Map<ChannelOption<?>, Object> tcpChannelOptions) {
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap.group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(serverChannelInitializer);
        for(ChannelOption option : tcpChannelOptions.keySet()) {
            serverBootstrap.childOption(option, tcpChannelOptions.get(option));
        }
        return serverBootstrap;
    }


    @Bean(name = "bossGroup", destroyMethod = "shutdownGracefully")
    public NioEventLoopGroup bossGroup() {
        return new NioEventLoopGroup(bossCount);
    }

    @Bean(name = "workerGroup", destroyMethod = "shutdownGracefully")
    public NioEventLoopGroup workerGroup() {
        return new NioEventLoopGroup(workerCount);
    }

    @Bean(name = "tcpChannelOptions")
    public Map<ChannelOption<?>, Object> tcpChannelOptions() {
        Map<ChannelOption<?>, Object> optionMap = new HashMap<>();
        optionMap.put(ChannelOption.SO_KEEPALIVE, true);
        optionMap.put(ChannelOption.SO_REUSEADDR, true);
        optionMap.put(ChannelOption.ALLOCATOR, PooledByteBufAllocator.DEFAULT);
        return optionMap;
    }


    @Bean(name = "tcpPort")
    public InetSocketAddress tcpPort() {
        return new InetSocketAddress(serverPort);
    }

}
