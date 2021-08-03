package com.example.recyclerviewapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewapplication.Adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
      //  MyAdapter myAdapter=new MyAdapter();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String arr[]={"c","c++","JAVA","PHP","NET","JQery","c","c++","JAVA","PHP","NET","JQery","c","c++","JAVA","PHP","NET","JQery"};
        recyclerView.setAdapter(new MyAdapter(arr));
    }
}