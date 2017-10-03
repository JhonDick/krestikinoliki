package com.example.artur.lessonsandroidstudio;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity  implements OnClickListener{
    Button butStart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butStart = (Button)findViewById(R.id.butStart);
        butStart.setOnClickListener(this);






    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, GameKrestiki.class);
        startActivity(intent);

    }
}
