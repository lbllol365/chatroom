package com.lbl.chatroom.netty.codec;

import com.alibaba.fastjson.JSON;
import com.lbl.chatroom.enums.MessageTypeEnum;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;

import java.util.List;
import java.util.Map;

/**
 *
 * websocket文字帧解析为消息并写入pipeline
 * */
public class TextFrameToMessageDecoder extends MessageToMessageDecoder<TextWebSocketFrame> {
    @Override
    protected void decode(ChannelHandlerContext ctx, TextWebSocketFrame msg, List<Object> out) throws Exception {
        String messageJSON = msg.text();
        Map<String, Object> messageMap = JSON.parseObject(messageJSON, Map.class);
        int messageTypeCode = (Integer) messageMap.get("typeCode");
        out.add(JSON.parseObject(messageMap.get("body").toString(), MessageTypeEnum.parseMessageType(messageTypeCode)));
    }
}
