package com.olusola.tictactoe;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

    public class Main3Activity extends AppCompatActivity {
        private int counts=0;
        private int mPlayer = 1;
        private ArrayList<Integer> Player1 = new ArrayList<Integer>();
        private ArrayList<Integer> Player2 = new ArrayList<Integer>();
        private TextView player1Score;
        private TextView player2Score;
        private int p1Points;
        private int p2Points;
        private TableLayout tbl;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main3);

            player1Score = findViewById(R.id.p1_score);
            player2Score = findViewById(R.id.p2_score);



        }

        private void play(int butid, Button pressedButton ){
            if(mPlayer==1){
                pressedButton.setText("X");
                Player1.add(butid);
                counts++;
                mPlayer=2;
                if (counts<9) {
                    SystemPlay();
                }

            } else{
                pressedButton.setText("O");
                Player2.add(butid);
                mPlayer=1;
            }
            pressedButton.setEnabled(false);
            DecideWinner(counts);
        }

        public void getID(View view){
            Button pressedButton = (Button) view;
            int butid = 0;
            counts +=1;
            switch (pressedButton.getId()){
                case R.id.b1: butid=1;
                    break;

                case R.id.b2: butid=2;
                    break;

                case R.id.b3: butid=3;
                    break;

                case R.id.b4: butid=4;
                    break;

                case R.id.b5: butid=5;
                    break;

                case R.id.b6: butid=6;
                    break;

                case R.id.b7: butid=7;
                    break;

                case R.id.b8: butid=8;
                    break;

                case R.id.b9: butid=9;
                    break;
            }
            play(butid, pressedButton );
        }

        void DecideWinner(int counts){
            int Winner=-1;
            /// row 1
            if(Player1.contains(1) && Player1.contains(2) && Player1.contains(3)){
                Winner=1;
            }
            if(Player2.contains(1) && Player2.contains(2) && Player2.contains(3)){
                Winner=2;
            }

            ///row  2
            if(Player1.contains(4) && Player1.contains(5) && Player1.contains(6)){
                Winner=1;
            }
            if(Player2.contains(4) && Player2.contains(5) && Player2.contains(6)){
                Winner=2;
            }


            ///row 3
            if(Player1.contains(7) && Player1.contains(8) && Player1.contains(9)){
                Winner=1;
            }
            if(Player2.contains(7) && Player2.contains(8) && Player2.contains(9)){
                Winner=2;
            }

            ///column 1
            if(Player1.contains(1) && Player1.contains(4) && Player1.contains(7)){
                Winner=1;
            }
            else if(Player2.contains(1) && Player2.contains(4) && Player2.contains(7)){
                Winner=2;
            }

            ///column2
            if(Player1.contains(2) && Player1.contains(5) && Player1.contains(8)){
                Winner=1;
            }
            if(Player2.contains(2) && Player2.contains(5) && Player2.contains(8)){
                Winner=2;
            }

            ///column 3
            if(Player1.contains(3) && Player1.contains(6) && Player1.contains(9)){
                Winner=1;
            }
            if(Player2.contains(3) && Player2.contains(6) && Player2.contains(9)){
                Winner=2;
            }

            ///diagonal 1
            if(Player1.contains(1) && Player1.contains(5) && Player1.contains(9)){
                Winner=1;
            }
            if(Player2.contains(1) && Player2.contains(5) && Player2.contains(9)){
                Winner=2;
            }

            ///diagonal 2
            if(Player1.contains(3) && Player1.contains(5) && Player1.contains(7)){
                Winner=1;
            }
            if(Player2.contains(3) && Player2.contains(5) && Player2.contains(7)){
                Winner=2;
            }

            if(Winner !=-1){

                if(Winner == 1){
                    player1Wins();
                }
                if(Winner == 2){
                    player2Wins();
                }
            }

            if(Winner==-1 && counts==9){
                Toast.makeText(this,"DRAW",Toast.LENGTH_LONG).show();
            }

        }

        void SystemPlay(){
            ArrayList<Integer> AvailableCells = new ArrayList<Integer>();
            for (int ButId = 1; ButId < 9; ButId++){
                if (!(Player1.contains(ButId) || Player2.contains(ButId))){
                    AvailableCells.add(ButId);
                }
            }
            Random r = new Random();
            int RandIndex = r.nextInt(AvailableCells.size());
            int CellId = AvailableCells.get(RandIndex);

            Button buselected = null;
            switch (CellId){
                case 1 :
                    buselected = (Button) findViewById(R.id.b1);
                    break;
                case 2 :
                    buselected = (Button) findViewById(R.id.b2);
                    break;
                case 3 :
                    buselected = (Button) findViewById(R.id.b3);
                    break;
                case 4 :
                    buselected = (Button) findViewById(R.id.b4);
                    break;
                case 5 :
                    buselected = (Button) findViewById(R.id.b5);
                    break;
                case 6 :
                    buselected = (Button) findViewById(R.id.b6);
                    break;
                case 7 :
                    buselected = (Button) findViewById(R.id.b7);
                    break;
                case 8 :
                    buselected = (Button) findViewById(R.id.b8);
                    break;
                case 9 :
                    buselected = (Button) findViewById(R.id.b9);
                    break;

            }
            play(CellId, buselected );

        }
        private void player1Wins() {
            p1Points++;
            Toast.makeText(this, "X wins!", Toast.LENGTH_SHORT).show();
            tbl.setEnabled(false);
            updatePointsText();
        }

        private void player2Wins() {
            p2Points++;
            Toast.makeText(this, "O wins!", Toast.LENGTH_SHORT).show();
            tbl.setEnabled(false);
            updatePointsText();
        }

        private void updatePointsText() {
            player1Score.setText(" " + p1Points);
            player2Score.setText(" " + p2Points);
        }

    }
