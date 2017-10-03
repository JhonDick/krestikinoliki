package com.example.artur.lessonsandroidstudio;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by artur on 03.10.2017.
 */

public class CheckWinnerO {
    Intent intent;
    public void checkWinnerO(String[][] charsd, Activity activity){
        checkWinnerDioganalLeft(charsd, activity);
        checkWinnerDioganalRight(charsd, activity);
        checkWinnerVertical(charsd, activity);
        checkWinnnerHorizontal(charsd, activity);

    }
    public void checkWinnerVertical(String[][] charsd, Activity activity){
        int counter;
        for(int i = 0; i<3;i++){
            counter = 0;
            for( int j = 0; j<3; j++){
                if(charsd[j][i]=="o"){
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
                if(charsd[i][j]=="o"){
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

            if(charsd[i][i]=="o"){
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
            if(charsd[j][i]=="o"){
                counter++;
                if(counter==3){
                    startSelectedActivity(activity);
                }
            }

        }
    }




    public void startSelectedActivity(Activity activity
    ){
        Intent intent = new Intent(activity, WinO.class);
        activity.startActivity(intent);
    }

}
