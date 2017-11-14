package com.example.azadljy.slidingconflicttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.SimpleAdapter;

import com.example.azadljy.slidingconflicttest.weight.MyTestFramLayout;
import com.example.azadljy.slidingconflicttest.weight.MyTestListView;
import com.example.azadljy.slidingconflicttest.weight.MyTestScrollView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FramLayoutAndListViewTestActivity extends AppCompatActivity {
    private MyTestListView listView;
    private MyTestFramLayout framelayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fram_layout_and_list_view_test);
        listView = (MyTestListView) findViewById(R.id.test_listview);
        framelayout = (MyTestFramLayout) findViewById(R.id.framelayout);
        List<Map<String, Object>> listems = new ArrayList<>();
        for (int i = 0; i < 33; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", "小明" + i);
            listems.add(map);
        }
        listView.setAdapter(new SimpleAdapter(this, listems, R.layout.item, new String[]{"name"}, new int[]{R.id.list_item}));
    }
}
