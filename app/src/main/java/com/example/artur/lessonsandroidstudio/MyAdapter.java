package com.example.artur.lessonsandroidstudio;

/**
 * Created by artur on 07.10.2017.
 */

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
    boolean check = true;
    CheckWinner winner = new CheckWinner();
    Resourses square = new Resourses();
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

               if(position == 0){
                   if(check){
                       check = false;


                       square.square[0][0] = "o";
                       ShowMessageWin(holder.button,"o");
                       winner.checkWinner(square.square);
                       
                   }else{
                         check = true;
                         square.square[0][0] = "x";
                         ShowMessageWin(holder.button,"x");
                         winner.checkWinner(square.square);
                       
               }}
                if(position == 1){
                    if(check){
                        check = false;
                        square.square[0][1] = "o";
                        ShowMessageWin(holder.button,"o");
                        winner.checkWinner(square.square);
                        
                    }else{
                        check = true;
                        square.square[0][1] = "x";
                        ShowMessageWin(holder.button,"x");
                        winner.checkWinner(square.square);
                        
                }}
                if(position == 2){
                    if(check){
                        check = false;
                        square.square[0][2] = "o";
                        ShowMessageWin(holder.button,"o");
                        winner.checkWinner(square.square);
                    }else{check = true;
                         square.square[0][2] = "x";
                          ShowMessageWin(holder.button,"x");
                          winner.checkWinner(square.square);
                        
                }}
                if(position == 3){
                    if(check){
                        check = false;
                        square.square[1][0] = "o";
                        ShowMessageWin(holder.button,"o");
                        winner.checkWinner(square.square);
                    }else{
                        check = true;
                        square.square[1][0] = "x";
                        ShowMessageWin(holder.button,"x");
                        winner.checkWinner(square.square);
                        
                }}
                if(position == 4){
                    if(check){
                        check = false;
                        square.square[1][1] = "o";
                        ShowMessageWin(holder.button,"o");
                        winner.checkWinner(square.square);
                    }else{
                        check = true;
                        square.square[1][1] = "x";
                        ShowMessageWin(holder.button,"x");
                        winner.checkWinner(square.square);
                        }
                }
                if(position == 5){
                    if(check){
                        check = false;
                        square.square[1][2] = "o";
                        ShowMessageWin(holder.button,"o");
                        winner.checkWinner(square.square);
                    }else{
                        check = true;
                        square.square[1][2] = "x";
                        ShowMessageWin(holder.button,"x");
                        winner.checkWinner(square.square);
                        }
                }
                if(position == 6){
                    if(check){
                        check = false;
                        square.square[2][0] = "o";
                        ShowMessageWin(holder.button,"o");
                        winner.checkWinner(square.square);
                        
                    }else{
                        check = true;
                        square.square[2][0] = "x";
                        ShowMessageWin(holder.button,"x");
                        winner.checkWinner(square.square);}
                }
                if(position == 7){
                    if(check){
                        check = false;
                        square.square[2][1] = "o";
                        ShowMessageWin(holder.button,"o");
                        winner.checkWinner(square.square);
                        
                    }else{
                        check = true;
                        square.square[2][1] = "x";
                        ShowMessageWin(holder.button,"x");
                        winner.checkWinner(square.square);}
                }
                if(position == 8){
                    if(check){
                        check = false;
                        square.square[2][2] = "o";
                        ShowMessageWin(holder.button,"o");
                        winner.checkWinner(square.square);
                    }else{
                        check = true;
                        square.square[2][2] = "x";

                        ShowMessageWin(holder.button,"x");
                        winner.checkWinner(square.square);}
                }




            }
        });



        return  convertView;

    }
    public void ShowMessageWin(Button btn, String text){




        btn.setText(text);
        btn.setClickable(false);
       // winner.checkWinner(square.square);


}
    public void ResetGame(){

    }}