package com.example.azadljy.slidingconflicttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ScrollView scrollView;
    String TAG = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Map<String, Object>> listems = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", "小明" + i);
            listems.add(map);
        }
        listView = (ListView) findViewById(R.id.test_listview);
        scrollView = (ScrollView) findViewById(R.id.scrollView);
        listView.setAdapter(new SimpleAdapter(this, listems, R.layout.item, new String[]{"name"}, new int[]{R.id.list_item}));

        Log.e(TAG, "onCreate: " + listView.getMeasuredHeight());
        Log.e(TAG, "onCreate: " + scrollView.getMeasuredHeight());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: " + listView.getMeasuredHeight());
        Log.e(TAG, "onResume: " + scrollView.getMeasuredHeight());
    }

    public void go(View view) {
        Log.e(TAG, "go: " + listView.getMeasuredHeight());
        Log.e(TAG, "go: " + listView.getChildAt(0).getMeasuredHeight());
        Log.e(TAG, "go: " + scrollView.getMeasuredHeight());
    }

}
