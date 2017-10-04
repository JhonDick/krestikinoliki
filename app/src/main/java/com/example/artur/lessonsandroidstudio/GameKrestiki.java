package com.example.artur.lessonsandroidstudio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class GameKrestiki extends Activity implements OnClickListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9; // Попахивает говнокодом вынести в лист или в масив (RecycleView почитай там есть грид )

    boolean check = true;
    CharsContain showChar = new CharsContain();



    CheckWinnerX winnerX = new CheckWinnerX();
    CheckWinnerO winnerO = new CheckWinnerO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_krestiki);
        CreateGame();


    }


    public void CreateGame(){
// Попахивает говнокодом
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);



// Попахивает говнокодом было бы листом прогнал циклом

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {

// Попахивает говнокодом можно вынести в метод

        if (view.getId() == R.id.b1) {
            if (check == true) { // можно просто оставить переменную чек она и так бул
                b1.setText("o");
                check = false;
                b1.setClickable(false);
                showChar.chars[0][0] = "o";// магические числа  + о вынести в константу , вдруг ты ее захочешь поменять на 0  например
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
            }
            else {b1.setText("x");
                check = true;
                showChar.chars[0][0] = "x";
                b1.setClickable(false);
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
                }

        }
        if (view.getId() == R.id.b2) {
            if (check == true) {
                b2.setText("o");
                check = false;
                showChar.chars[0][1] = "o";
                b2.setClickable(false);
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
            }
            else {b2.setText("x");
                showChar.chars[0][1] = "x";
                check = true;
                b2.setClickable(false);
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
                }

        }
        if (view.getId() == R.id.b3) {
            if (check == true) {
                b3.setText("o");
                showChar.chars[0][2] = "o";
                check = false;
                b3.setClickable(false);
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
            }
            else {b3.setText("x");
                check = true;
                showChar.chars[0][2] = "x";
                b3.setClickable(false);
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
                }

        }
        if (view.getId() == R.id.b4) {
            if (check == true) {
                b4.setText("o");
                check = false;
                showChar.chars[1][0] = "o";
                b4.setClickable(false);
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
            }
            else {b4.setText("x");
                check = true;
                showChar.chars[1][0] = "x";
                b4.setClickable(false);
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
                }

        }
        if (view.getId() == R.id.b5) {
            if (check == true) {
                b5.setText("o");
                check = false;
                showChar.chars[1][1] = "o";
                b5.setClickable(false);
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
            }
            else {b5.setText("x");
                showChar.chars[1][1] = "x";
                check = true;
                b5.setClickable(false);
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
                }

        }
        if (view.getId() == R.id.b6) {
            if (check == true) {
                b6.setText("o");
                check = false;
                showChar.chars[1][2] = "o";
                b6.setClickable(false);
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
            }
            else {b6.setText("x");
                check = true;
                showChar.chars[1][2] = "x";
                b6.setClickable(false);
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
                }

        }
        if (view.getId() == R.id.b7) {
            if (check == true) {
                b7.setText("o");
                check = false;
                showChar.chars[2][0] = "o";
                b7.setClickable(false);
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
            }
            else {b7.setText("x");
                check = true;
                showChar.chars[2][0] = "x";
                b7.setClickable(false);
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
                }

        }
        if (view.getId() == R.id.b8) {
            if (check == true) {
                b8.setText("o");
                showChar.chars[2][1] = "o";
                check = false;
                b8.setClickable(false);
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
            }
            else {b8.setText("x");
                check = true;
                showChar.chars[2][1] = "x";
                b8.setClickable(false);
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
                }

        }
        if (view.getId() == R.id.b9) {
            if (check == true) {
                b9.setText("o");
                showChar.chars[2][2] = "o";
                check = false;
                b9.setClickable(false);
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
            }
            else {b9.setText("x");
                check = true;
                showChar.chars[2][2] = "x";
                b9.setClickable(false);
                winnerX.checkWinnerX(showChar.chars, this);
                winnerO.checkWinnerO(showChar.chars, this);
                }

        }





    }
}
