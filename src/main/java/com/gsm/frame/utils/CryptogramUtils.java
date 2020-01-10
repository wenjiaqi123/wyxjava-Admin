package com.gsm.frame.utils;

import cn.hutool.core.codec.Base64;

/**
 * 对密码加密 解密
 * MTIzNDU2   123456
 * MTExMTEx   111111
 */
public class CryptogramUtils {

    /**
     * 使用 base64 加密
     * @param str 需要加密的明文
     * @return 密文
     */
    public static String base64Encode(String str){
        String s = Base64.encode(str);
        return s;
    }

    /**
     * 使用 base64 解密
     * @param str Base64加密的密文
     * @return 明文
     */
    public static String base64Decode(String str){
        String s = Base64.decodeStr(str);
        return s;
    }

    public static void main(String[] args) {
        String s = CryptogramUtils.base64Encode("111111");
        System.out.println(s);
        String s1 = CryptogramUtils.base64Decode(s);
        System.out.println(s1);
    }
}
