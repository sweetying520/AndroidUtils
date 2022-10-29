package com.dream.androidutils;

/**
 * function: StringUtils
 *
 * @author zy
 * @since 2022/10/29
 */
public class StringUtils {

    /**
     * 获取字符串的字节数组
     */
    public static byte[] getByteArray(String str){
        return str.getBytes();
    }

    /**
     * 将字符串转换成字符数组
     */
    public static char[] getCharArray(String str){
        return str.toCharArray();
    }
}
