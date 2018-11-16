package com.zjh.demomodule;

import android.content.Context;
import android.widget.Toast;

/**
 * 吐司工具类
 *
 * @author zjh
 * @date 16/11/18
 */
public class ToastUtils {

    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
