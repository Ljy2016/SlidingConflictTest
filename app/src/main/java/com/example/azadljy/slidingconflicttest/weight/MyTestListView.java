package com.example.azadljy.slidingconflicttest.weight;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ListView;

/**
 * 作者：Ljy on 2017/11/9.
 * 功能：测试listview
 */


public class MyTestListView extends ListView {
    public MyTestListView(Context context) {
        super(context);
    }

    public MyTestListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTestListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        final int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        final int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        Log.e("TAG", "onMeasure: listview  widthMode------" + widthMode);
        Log.e("TAG", "onMeasure: listview  heightMode------" + heightMode);
    }

}
