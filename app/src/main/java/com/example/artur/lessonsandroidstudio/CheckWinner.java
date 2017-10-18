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
    //public static final String[][] charsd = new String[3][3];
     static int winO = 0;
     static int winX = 0;
     //int unknow;
    //public int counterUnknown = 0;

    public void checkWinner(String[][] charsd){
         checkWinnerDioganalLeft(charsd);
         checkWinnerDioganalRight(charsd);
         checkWinnerVertical(charsd);
         checkWinnnerHorizontal(charsd);
         if(winO == 1){
             MainActivity.textView.setText("Победили нолики");
         }
         else if(winX == 2){
             MainActivity.textView.setText("Победили крестики");
         }





    }
    public void checkWinnerVertical(String[][] charsd){


        for(int i = 0; i<3;i++){
            int counterX = 0;
            int counterO = 0;
            for( int j = 0; j<3; j++){
                if(charsd[j][i] == "x"){
                    counterX++;
                    if(counterX == 3){
                        winX  = 2;






                    }
                }
                if(charsd[j][i]=="o"){

                    counterO++;
                    if(counterO == countWin){
                        winO = 1;
                    }}




            }
        }



    }
    public void checkWinnnerHorizontal(String[][] charsd){

        for(int i = 0; i<3; i++){
            int qwe = 0;
            int qwe2 = 0;
            for(int j = 0; j<3; j++){
                if(charsd[i][j]=="x"){
                    qwe++;
                    if (qwe==3){
                        winX = 2;
                    }
                }
                if(charsd[i][j]=="o"){
                    qwe2++;
                    if(qwe2==3){
                        winO=1;
                    }
                }
        }

            }

        /*int counterX;
        int counterO;
        for(int i = 0; i<countWin; i++){
            counterX = 0;
            counterO = 0;
            for(int j = 0; j<countWin; j++){
                if(charsd[i][j].equals("x")){
                    counterX++;
                    if(counterX==countWin){
                       winX = 2;


                    }
                }
                else{
                    counterO++;
                    if(counterO == countWin){
                        winO = 1;
                    }
                }
            }


        }*/



    }
    public void checkWinnerDioganalRight(String[][]charsd){
        int countO = 0;
        int countX = 0;
        for(int i = 0; i<3; i++){

            if(charsd[i][i]== "o"){
                countO++;
                if(countO == 3){
                    winO = 1;
                }
            }
            if(charsd[i][i] == "x"){
                countX++;
                if(countX==3){
                    winX =2;
                }
            }
        }
        /*
        if(charsd[0][0] == "x"){
            winO = 1;
        }
        int counterX = 0;
        int counterO = 0;
        for(int i = 0; i<3; i++){

            if(charsd[i][i].equals("x")){
                counterX++;
                if(counterX == 3){
                    winX = 2;

                }
            }
            else{
                counterO++;
                if(counterO == 3){
                    winO = 1;
                }
            }*/
        }





    public void checkWinnerDioganalLeft(String[][] charsd){


        int countO = 0;
        int countX = 0;
        for(int i = 2, j =0; j<3; i--, j++){

            if(charsd[j][i]== "o"){
                countO++;
                if(countO == 3){
                    winO = 1;
                }
            }
            if(charsd[j][i] == "x"){
                countX++;
                if(countX==3){
                    winX =2;
                }
            }
        }


    }







}
