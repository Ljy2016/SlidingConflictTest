package com.example.azadljy.slidingconflicttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SimpleAdapter;

import com.example.azadljy.slidingconflicttest.weight.MyTestListView;
import com.example.azadljy.slidingconflicttest.weight.MyTestScrollView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity {
    private MyTestListView listView;
    private MyTestScrollView scrollView;
    String TAG = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Map<String, Object>> listems = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", "小明" + i);
            listems.add(map);
        }
        listView = (MyTestListView) findViewById(R.id.test_listview);
        scrollView = (MyTestScrollView) findViewById(R.id.scrollView);
        listView.setAdapter(new SimpleAdapter(this, listems, R.layout.item, new String[]{"name"}, new int[]{R.id.list_item}));
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void go(View view) {
        Log.e(TAG, "go: " + listView.getMeasuredHeight());
        Log.e(TAG, "go: " + listView.getChildAt(0).getMeasuredHeight());
        Log.e(TAG, "go: " + scrollView.getMeasuredHeight());
    }

}
