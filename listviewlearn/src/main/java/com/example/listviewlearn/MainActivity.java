package com.example.listviewlearn;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity{

    String[] data = new String[9];

    GridView gvMain;
    ArrayAdapter<String> adapter;
    Button button;
    OnItemClickListener listener;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        gvMain = findViewById(R.id.gvMain);


        MyAdapter myAdapter = new MyAdapter(this,data);

        gvMain.setAdapter(myAdapter);










    }






}
