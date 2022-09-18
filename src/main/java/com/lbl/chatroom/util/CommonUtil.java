package com.lbl.chatroom.util;

import java.math.BigInteger;
import java.security.MessageDigest;

public class CommonUtil {

    /**
     * 获取指定内容的MD5
     * */
    public static String getMD5(String content) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] bytes = digest.digest(content.getBytes());
            BigInteger bigInteger = new BigInteger(1, bytes);
            return bigInteger.toString(16);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
