package com.example.databaselearn;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tv,tv2,tv3;
    EditText ed_fName, ed_lName, ed_Age;
    Button buttonShow;
    Button buttonAdd;
    ListView listView;
    final DBhandler dBhandler = new DBhandler(this);
    //List<Employee> array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.textView);
        tv2 = (TextView)findViewById(R.id.textView2);
        tv3 = (TextView)findViewById(R.id.textView3);
        listView = (ListView) findViewById(R.id.listview) ;

        ed_lName = (EditText)findViewById(R.id.editText3);
        ed_fName = (EditText)findViewById(R.id.editText2);
        ed_Age = (EditText)findViewById(R.id.editText);

        buttonShow = (Button)findViewById(R.id.button3);
        buttonAdd = (Button)findViewById(R.id.button4);
        buttonShow.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);





    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button4: List<Employee> array = dBhandler.getAllEmployees();
                ArrayList<String> newArray = new ArrayList<String>();


                for(Employee iter: array){
                    String str;
                    str = iter.getFname()+" "+iter.getLname()+" "+iter.getAge()+" года";

                    newArray.add(str);
                }
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, newArray);
                listView.setAdapter(adapter);
            case R.id.button3:     dBhandler.addEmployee(new Employee(ed_fName.getText().toString(), ed_lName.getText().toString(),
                    Integer.valueOf(String.valueOf(ed_Age.getText())))); break;
        }

    }
}
