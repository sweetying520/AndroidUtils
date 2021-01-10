package com.dream.androidutils;

import android.content.Context;
import android.widget.Toast;

/**
 * function: Toast工具类
 *
 * @author zy
 * @since 1/8/21
 */
public class ToastUtils {

    /**
     * 展示短时间Toast
     * 
     * @param mContext 上下文
     * @param mShowText 展示的内容
     */
    public static void showShortToast(Context mContext,String mShowText){
        Toast.makeText(mContext, mShowText, Toast.LENGTH_SHORT).show();
    }


    /**
     * 展示长时间Toast
     *
     * @param mContext 上下文
     * @param mShowText 展示的内容
     */
    public static void showLongToast(Context mContext,String mShowText){
        Toast.makeText(mContext, mShowText, Toast.LENGTH_LONG).show();
    }
}
