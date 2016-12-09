package com.apkcore.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        List<String> strs = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            strs.add("a" + i);
        }
        rv.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        RvAdapter adapter = new RvAdapter(this, strs);
        rv.setAdapter(adapter);
    }
}
