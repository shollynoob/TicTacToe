package com.olusola.tictactoe;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class DecidePage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decide_page);

        TextView showWinner = (TextView)findViewById(R.id.displaywin);
        Bundle bundle = getIntent().getExtras();

        if(bundle!=null) {
            String j =(String) bundle.get("p");
            showWinner.setText(j);
        }

    }

}
