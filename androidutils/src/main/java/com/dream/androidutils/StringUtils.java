package com.dream.androidutils;

/**
 * function: StringUtils
 *
 * @author zy
 * @since 2022/10/29
 */
public class StringUtils {

    /**
     * 获取字符串长度
     */
    public static int getLength(String str){
        return str.length();
    }

    /**
     * 将字符串转换成字符数组
     */
    public static char[] getCharArray(String str){
        return str.toCharArray();
    }
}
