package com.example.artur.lessonsandroidstudio;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends Activity{
    static TextView textView;
    String data[] = new String[9];
    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        gridView = findViewById(R.id.gvMain);
        MyAdapter adapter = new MyAdapter(this,data);
        gridView.setAdapter(adapter);






    }


}
