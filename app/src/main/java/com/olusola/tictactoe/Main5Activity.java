package com.olusola.tictactoe;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Main5Activity extends AppCompatActivity {
    private int counts = 0;
    private int mPlayer = 1;
    private ArrayList<Integer> Player1 = new ArrayList<Integer>();
    private ArrayList<Integer> Player2 = new ArrayList<Integer>();
    private TextView player1Score;
    private TextView player2Score;
    private int p1Points;
    private int p2Points;
    private Button[] allButtons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        player1Score = findViewById(R.id.p1_score);
        player2Score = findViewById(R.id.p2_score);


    }

    private void play(int butid, Button pressedButton) {
        if (mPlayer == 1) {
            pressedButton.setText("X");
            Player1.add(butid);
            mPlayer = 2;
            if (counts < 25) {
                SystemPlay();
            }
            counts++;
        } else {
            pressedButton.setText("O");
            Player2.add(butid);
            mPlayer = 1;
        }
        pressedButton.setEnabled(false);
        DecideWinner(counts);
    }

    public void getID(View view) {
        Button pressedButton = (Button) view;
        int butid = 0;
        counts++;
        switch (pressedButton.getId()) {
            case R.id.b1:
                butid = 1;
                break;

            case R.id.b2:
                butid = 2;
                break;

            case R.id.b3:
                butid = 3;
                break;

            case R.id.b4:
                butid = 4;
                break;

            case R.id.b5:
                butid = 5;
                break;

            case R.id.b6:
                butid = 6;
                break;

            case R.id.b7:
                butid = 7;
                break;

            case R.id.b8:
                butid = 8;
                break;

            case R.id.b9:
                butid = 9;
                break;

            case R.id.b10:
                butid = 10;
                break;

            case R.id.b11:
                butid = 11;
                break;

            case R.id.b12:
                butid = 12;
                break;

            case R.id.b13:
                butid = 13;
                break;

            case R.id.b14:
                butid = 14;
                break;

            case R.id.b15:
                butid = 15;
                break;

            case R.id.b16:
                butid = 16;
                break;

            case R.id.b17:
                butid = 17;
                break;

            case R.id.b18:
                butid = 18;
                break;

            case R.id.b19:
                butid = 19;
                break;

            case R.id.b20:
                butid = 20;
                break;

            case R.id.b21:
                butid = 21;
                break;

            case R.id.b22:
                butid = 22;
                break;

            case R.id.b23:
                butid = 23;
                break;

            case R.id.b24:
                butid = 24;
                break;

            case R.id.b25:
                butid = 25;
                break;
        }
        play(butid, pressedButton);
    }

    void DecideWinner(int counts) {
        int Winner = -1;
        /// row 1
        if (Player1.contains(1) && Player1.contains(2) && Player1.contains(3) && Player1.contains(4) && Player1.contains(5)) {
            Winner = 1;
        }
        if (Player2.contains(1) && Player2.contains(2) && Player2.contains(3) && Player2.contains(4) && Player2.contains(5)) {
            Winner = 2;
        }
        ///row  2
        if (Player1.contains(6) && Player1.contains(7) && Player1.contains(8) && Player1.contains(9) && Player1.contains(10)) {
            Winner = 1;
        }
        if (Player2.contains(6) && Player2.contains(7) && Player2.contains(8) && Player2.contains(9) && Player2.contains(10)) {
            Winner = 2;
        }
        ///row 3
        if (Player1.contains(11) && Player1.contains(12) && Player1.contains(13) && Player1.contains(14) && Player1.contains(15)) {
            Winner = 1;
        }
        if (Player2.contains(11) && Player2.contains(12) && Player2.contains(13) && Player2.contains(14) && Player2.contains(15)) {
            Winner = 2;
        }

        ///row 4
        if (Player1.contains(16) && Player1.contains(17) && Player1.contains(18) && Player1.contains(19) && Player1.contains(20)) {
            Winner = 1;
        }
        if (Player2.contains(16) && Player2.contains(17) && Player2.contains(18) && Player2.contains(19) && Player2.contains(20)) {
            Winner = 2;
        }
        ///row 5
        if (Player1.contains(21) && Player1.contains(22) && Player1.contains(23) && Player1.contains(24) && Player1.contains(25)) {
            Winner = 1;
        }
        if (Player2.contains(21) && Player2.contains(22) && Player2.contains(23) && Player2.contains(24) && Player2.contains(25)) {
            Winner = 2;
        }


        ///column 1
        if (Player1.contains(1) && Player1.contains(6) && Player1.contains(11) && Player1.contains(16) && Player1.contains(21)) {
            Winner = 1;
        }
        if (Player2.contains(1) && Player2.contains(6) && Player2.contains(11) && Player2.contains(16) && Player2.contains(21)) {
            Winner = 2;
        }
        ///column2
        if (Player1.contains(2) && Player1.contains(7) && Player1.contains(12) && Player1.contains(17) && Player1.contains(22)) {
            Winner = 1;
        }
        if (Player2.contains(2) && Player2.contains(7) && Player2.contains(12) && Player2.contains(17) && Player2.contains(22)) {
            Winner = 2;
        }
        ///column 3
        if (Player1.contains(3) && Player1.contains(8) && Player1.contains(13) && Player1.contains(18) && Player1.contains(23)) {
            Winner = 1;
        }
        if (Player2.contains(3) && Player2.contains(8) && Player2.contains(13) && Player2.contains(18) && Player2.contains(23)) {
            Winner = 2;
        }
        ///column 4
        if (Player1.contains(4) && Player1.contains(9) && Player1.contains(14) && Player1.contains(19) && Player1.contains(24)) {
            Winner = 1;
        }
        if (Player2.contains(4) && Player2.contains(9) && Player2.contains(14) && Player2.contains(19) && Player2.contains(24)) {
            Winner = 2;
        }
        ///column 5
        if (Player1.contains(5) && Player1.contains(10) && Player1.contains(15) && Player1.contains(20) && Player1.contains(25)) {
            Winner = 1;
        }
        if (Player2.contains(5) && Player2.contains(10) && Player2.contains(15) && Player2.contains(20) && Player2.contains(25)) {
            Winner = 2;
        }


        ///diagonal 1a
        if (Player1.contains(1) && Player1.contains(7) && Player1.contains(13) && Player1.contains(19) && Player1.contains(25)) {
            Winner = 1;
        }
        if (Player2.contains(1) && Player2.contains(7) && Player2.contains(13) && Player2.contains(19) && Player2.contains(25)) {
            Winner = 2;
        }


        ///diagonal 2a
        if (Player1.contains(5) && Player1.contains(9) && Player1.contains(13) && Player1.contains(17) && Player1.contains(21)) {
            Winner = 1;
        }
        if (Player2.contains(5) && Player2.contains(9) && Player2.contains(13) && Player2.contains(17) && Player2.contains(21)) {
            Winner = 2;
        }


        if (Winner != -1) {

            if (Winner == 1) {
                player1Wins();
            }
            if (Winner == 2) {
                player2Wins();
            }
        }

        if (Winner == -1 && counts == 25) {
            Toast.makeText(this, "DRAW", Toast.LENGTH_LONG).show();
        }

    }

    void SystemPlay() {
        ArrayList<Integer> AvailableCells = new ArrayList<Integer>();
        for (int ButId = 1; ButId < 25; ButId++) {
            if (!(Player1.contains(ButId) || Player2.contains(ButId))) {
                AvailableCells.add(ButId);
            }
        }
        Random r = new Random();
        int RandIndex = r.nextInt(AvailableCells.size());
        int CellId = AvailableCells.get(RandIndex);

        Button buselected = null;
        switch (CellId) {
            case 1:
                buselected = (Button) findViewById(R.id.b1);
                break;
            case 2:
                buselected = (Button) findViewById(R.id.b2);
                break;
            case 3:
                buselected = (Button) findViewById(R.id.b3);
                break;
            case 4:
                buselected = (Button) findViewById(R.id.b4);
                break;
            case 5:
                buselected = (Button) findViewById(R.id.b5);
                break;
            case 6:
                buselected = (Button) findViewById(R.id.b6);
                break;
            case 7:
                buselected = (Button) findViewById(R.id.b7);
                break;
            case 8:
                buselected = (Button) findViewById(R.id.b8);
                break;
            case 9:
                buselected = (Button) findViewById(R.id.b9);
                break;
            case 10:
                buselected = (Button) findViewById(R.id.b10);
                break;
            case 11:
                buselected = (Button) findViewById(R.id.b11);
                break;
            case 12:
                buselected = (Button) findViewById(R.id.b12);
                break;
            case 13:
                buselected = (Button) findViewById(R.id.b13);
                break;
            case 14:
                buselected = (Button) findViewById(R.id.b14);
                break;
            case 15:
                buselected = (Button) findViewById(R.id.b15);
                break;
            case 16:
                buselected = (Button) findViewById(R.id.b16);
                break;
            case 17:
                buselected = (Button) findViewById(R.id.b17);
                break;
            case 18:
                buselected = (Button) findViewById(R.id.b18);
                break;
            case 19:
                buselected = (Button) findViewById(R.id.b19);
                break;
            case 20:
                buselected = (Button) findViewById(R.id.b20);
                break;
            case 21:
                buselected = (Button) findViewById(R.id.b21);
                break;
            case 22:
                buselected = (Button) findViewById(R.id.b22);
                break;
            case 23:
                buselected = (Button) findViewById(R.id.b23);
                break;
            case 24:
                buselected = (Button) findViewById(R.id.b24);
                break;
            case 25:
                buselected = (Button) findViewById(R.id.b25);
                break;
        }
        play(CellId, buselected);

    }

    private void player1Wins() {
        p1Points++;
        Toast.makeText(this, "X wins!", Toast.LENGTH_SHORT).show();
        updatePointsText();
        disableAllButton();
    }

    private void player2Wins() {
        p2Points++;
        Toast.makeText(this, "0 wins!", Toast.LENGTH_SHORT).show();
        updatePointsText();
        disableAllButton();
    }

    private void updatePointsText() {
        player1Score.setText("" + p1Points);
        player2Score.setText("" + p2Points);
    }

    public void resetGame(View view) {
        p1Points = 0;
        p2Points = 0;
        updatePointsText();
        resetBoard(view);
    }

    public void resetBoard(View view) {
        allButtons = new Button[25];
        for (int i = 0; i < allButtons.length; i++) {
            {
                String buttonID = "b" + (i + 1);
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                allButtons[i] = ((Button) findViewById(resID));
                allButtons[i].setText("");
                allButtons[i].setEnabled(true);
                Player1.clear();
                Player2.clear();
                counts = 0;
            }
        }
    }

    void disableAllButton() {
        allButtons = new Button[25];
        for (int i = 0; i < allButtons.length; i++) {
            {
                String buttonID = "b" + (i + 1);
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                allButtons[i] = ((Button) findViewById(resID));
                allButtons[i].setEnabled(false);
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent home = new Intent(Main5Activity.this, MainActivity.class);
            startActivity(home);
            return true;
        }
        if (id == R.id.action_quit) {
            closeAlert();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    void closeAlert() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(Main5Activity.this);
        dialog.setCancelable(false);
        dialog.setTitle("TicTac Game");
        dialog.setMessage("Are you sure you want to Quiz TicTac Game?");
        dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    finishAffinity();
                } else {
                    finish();
                    System.exit(0);
                }

            }
        })
                .setNegativeButton("Cancel ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Action for "Cancel".
                    }
                });

        final AlertDialog alert = dialog.create();
        alert.show();
    }
}
