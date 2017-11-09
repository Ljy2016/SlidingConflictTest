package com.example.azadljy.slidingconflicttest.weight;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;

/**
 * 作者：Ljy on 2017/11/9.
 * 功能：我的——我的资料
 */


public class MyTestScrollView extends ScrollView {
    public MyTestScrollView(Context context) {
        super(context);
    }

    public MyTestScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTestScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.e("TAG", "onMeasure: childHeightMode--------" + isFillViewport());
        final int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        Log.e("TAG", "onMeasure: scrollview  heightMode------" + heightMode);
//      setFillViewport(true);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        Log.e("TAG", "onMeasure: scrollview  heightMode------" + heightMode);
        final int childHeightMeasureSpec = MeasureSpec.makeMeasureSpec(
                1460, MeasureSpec.EXACTLY);
        final int childHeightMode = MeasureSpec.getMode(childHeightMeasureSpec);
        Log.e("TAG", "onMeasure: childHeightMode--------" + childHeightMode);
    }
}
