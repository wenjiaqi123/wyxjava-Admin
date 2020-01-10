package com.gsm.frame.utils;

import cn.hutool.core.util.IdUtil;

public class TokenUtils {
    /**
     * 获得 Token
     *
     * @return
     */
    public static String getToken() {
        String token = IdUtil.simpleUUID();
        return token;
    }

    public static void main(String[] args) {
    }
}
