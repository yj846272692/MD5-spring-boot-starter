package com.yj.md5test.service;

import com.yj.md5test.util.MD5Util;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/3/8
 */
public class Md5Service {
    public String getMD5(String input) {
        return MD5Util.getMD5(input.getBytes());
    }
}
