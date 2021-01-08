package com.dream.androidutils;

import android.content.res.Resources;

/**
 * function: 尺寸工具类
 *
 * @author zy
 * @since 1/8/21
 */
public class SizeUtils {

    /**
     * dp转换为px
     *
     * @param dpValue dp值
     * @return int
     */
    public static int dp2px(final float dpValue) {
        final float scale = Resources.getSystem().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * px转换为dp
     *
     * @param pxValue px值
     * @return int
     */
    public static int px2dp(final float pxValue) {
        final float scale = Resources.getSystem().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
