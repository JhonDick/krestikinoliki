package com.example.artur.lessonsandroidstudio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;

/**
 * Created by artur on 02.10.2017.
 */

public class CheckWinnerX {
    Intent intent;
    public void checkWinnerX(String[][] charsd, Activity activity){
        checkWinnerDioganalLeft(charsd, activity);
        checkWinnerDioganalRight(charsd, activity);
        checkWinnerVertical(charsd, activity);
        checkWinnnerHorizontal(charsd, activity);

    }
    public void checkWinnerVertical(String[][] charsd, Activity activity){ //Не красиво тут активити смотрится
        int counter;
        for(int i = 0; i<3;i++){
            counter = 0;
            for( int j = 0; j<3; j++){
                if(charsd[j][i]=="x"){ //нельзя так сравнивать строки!!! для этого есть equals
                    counter++;
                    if(counter == 3){
                        startSelectedActivity(activity);
                    }
                }
            }
        }

    }
    public void checkWinnnerHorizontal(String[][] charsd, Activity activity){
        int counter;
        for(int i = 0; i<3; i++){
            counter = 0;
            for(int j = 0; j<3; j++){
                if(charsd[i][j]=="x"){
                    counter++;
                    if(counter==3){
                        startSelectedActivity(activity);


                    }
                }
            }


        }

    }
    public void checkWinnerDioganalRight(String[][]charsd, Activity activity){
        int counter = 0;
        for(int i = 0; i<3; i++){

            if(charsd[i][i]=="x"){
                counter++;
                if(counter == 3){
                    startSelectedActivity(activity);

                }
            }
        }


    }
    public void checkWinnerDioganalLeft(String[][] charsd, Activity activity){
        int counter = 0;

        for(int i =0, j = 2; i<3;i++,j--){
            if(charsd[j][i]=="x"){
                counter++;
                if(counter==3){
                    startSelectedActivity(activity);
                }
            }

        }
    }




    public void startSelectedActivity(Activity activity //Зачем 2 активити если достаточно 1 и передавать данные кто именно победил
    ){
        Intent intent = new Intent(activity, Win.class);
        activity.startActivity(intent);
    }


}
