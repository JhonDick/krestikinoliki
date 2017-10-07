package com.example.listviewlearn;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.List;

/**
 * Created by artur on 06.10.2017.
 */

public class MyAdapter extends ArrayAdapter<String>{
    Context context;


    public MyAdapter(@NonNull Context context, String[] data) {
        super(context, R.layout.item,R.id.btnFOR,  data);
        this.context = context;
    }
    public class ViewHolder{
        public final Button button;
        public ViewHolder(View view){
            button = (Button)view.findViewById(R.id.btnFOR);


        }


    }
    ViewHolder holder;
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        final LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.item, parent, false);
        final ViewHolder holder = new ViewHolder(convertView );

        convertView.setTag(holder);
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = holder.button.getId();
                if(position == 1){holder.button.setText("hello");}



            }
        });



        return  convertView;

     }


}
