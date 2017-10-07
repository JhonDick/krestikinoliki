package com.example.artur.lessonsandroidstudio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;

/**
 * Created by artur on 02.10.2017.
 */

public class CheckWinner {
    Resourses square = new Resourses();
    public static final int countWin = 3;
    public static final String[][] charsd = new String[3][3];
     int winO = 0;
     int winX = 1;
     int unknow = 2;
    public int counterUnknown = 0;

    public int[] checkWinner(String[][] charsd){
         int a = (int)checkWinnerDioganalLeft(charsd);
         int b = (int)checkWinnerDioganalRight(charsd);
         int c = (int)checkWinnerVertical(charsd);
         int d = (int)checkWinnnerHorizontal(charsd);
         int[] winCounts = {a, b ,c,d};
        return winCounts;



    }
    public int checkWinnerVertical(String[][] charsd){
        int counterX;
        int counterO;

        for(int i = 0; i<countWin;i++){
            counterX = 0;
            counterO = 0;
            for( int j = 0; j<3; j++){
                if(charsd[j][i].equals("x")){
                    counterX++;
                    if(counterX == countWin){
                        return winX;





                    }
                }
                else {
                    counterO++;
                    if(counterO == countWin){
                        return winO;
                    }
                }



            }
        }

        return unknow;

    }
    public int checkWinnnerHorizontal(String[][] charsd){
        int counterX;
        int counterO;
        for(int i = 0; i<countWin; i++){
            counterX = 0;
            counterO = 0;
            for(int j = 0; j<countWin; j++){
                if(charsd[i][j].equals("x")){
                    counterX++;
                    if(counterX==countWin){
                        return winX;


                    }
                }
                else{
                    counterO++;
                    if(counterO == countWin){
                        return winO;
                    }
                }
            }


        }
        counterUnknown++;
        return unknow;

    }
    public int checkWinnerDioganalRight(String[][]charsd){
        int counterX = 0;
        int counterO = 0;
        for(int i = 0; i<countWin; i++){

            if(charsd[i][i].equals("x")){
                counterX++;
                if(counterX == countWin){

                    return winX;
                }
            }
            else{
                counterO++;
                if(counterO == countWin){
                    return winO;
                }
            }
        }
        counterUnknown++;
        return unknow;


    }
    public int checkWinnerDioganalLeft(String[][] charsd){
        int counterX = 0;
        int counterO = 0;

        for(int i =0, j = 2; i<countWin;i++,j--){
            if(charsd[j][i].equals("x")){
                counterX++;
                if(counterX == 3){
                    return winX;
                }

            }
            else{ counterO++;
                if (counterO==3){
                    return winO;
                }

            }



        }
        counterUnknown++;
        return unknow;
    }







}
