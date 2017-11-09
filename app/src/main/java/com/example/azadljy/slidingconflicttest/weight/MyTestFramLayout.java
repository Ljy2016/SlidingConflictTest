package com.example.azadljy.slidingconflicttest.weight;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * 作者：Ljy on 2017/11/9.
 * 功能：我的——我的资料
 */


public class MyTestFramLayout extends FrameLayout{
    public MyTestFramLayout(@NonNull Context context) {
        super(context);
    }

    public MyTestFramLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTestFramLayout(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
