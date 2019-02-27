package com.king.live.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 项目名：KingLive
 * 包名：com.king.live.utils
 * 创建者：guan_qi
 * 创建日期：2019/2/24 17:24
 * 邮箱：guan_qi@hoperun.com
 * 描述：Md5加密工具类
 */
public class Md5 {
    public static String strToMd5Low32(String str) {
        StringBuilder builder = new StringBuilder();
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(str.getBytes());
            byte[] bytes = md5.digest();
            for (byte b : bytes) {
                int digital = b&0xff;
                if (digital < 16)
                    builder.append(0);
                builder.append(Integer.toHexString(digital));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return builder.toString().toLowerCase();
    }
}
