package com.example.work;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Students> stList = new ArrayList<>();
        stList.add(new Students("Ivan", "23", 35));
        stList.add(new Students("Ivan", "13", 20));
        stList.add(new Students("Ivan", "10", 29));
        stList.add(new Students("Ivan", "9", 19));

        MyAdapter myAdapter = new MyAdapter(this,R.layout.list_student,stList);
        listView = findViewById(R.id.listView);
        listView.setAdapter(myAdapter);

    }
}