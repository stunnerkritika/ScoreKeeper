package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int teamAscore;
    private int teamBscore;
    private TextView scoreTeamA, scoreTeamB;

    private Button btnTeamA3;
    private Button btnTeamA2;
    private Button btnTeamA1;

    private Button resetButton;
    private Button resetButton1;

    private Button btnTeamB1;
    private Button btnTeamB2;
    private Button btnTeamB3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "x");

        scoreTeamA = findViewById(R.id.scoreTeamA);
        btnTeamA3 = findViewById(R.id.btn_teamA_score3);
        btnTeamA2 = findViewById(R.id.btn_teamA_score2);
        btnTeamA1 = findViewById(R.id.btn_teamA_score1);
        resetButton = findViewById(R.id.reset_btn);
        scoreTeamB= findViewById(R.id.scoreTeamB);
        btnTeamB1=findViewById(R.id.btn_teamB_score3);
        btnTeamB2=findViewById(R.id.btn_teamB_score2);
        btnTeamB3=findViewById(R.id.btn_teamB_score1);
        resetButton1=findViewById(R.id.reset_btn1);

        btnTeamB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamBscore= teamBscore+3;
                scoreTeamB.setText(""+teamBscore);
            }
        });
        btnTeamB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamBscore= teamBscore+2;
                scoreTeamB.setText(""+teamBscore);
            }
        });
        btnTeamB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamBscore= teamBscore+1;
                scoreTeamB.setText(""+teamBscore);
            }
        });



        btnTeamA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamAscore = teamAscore + 3;
                displayForTeamA(teamAscore);

            }
        });


        btnTeamA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamAscore = teamAscore + 2;
                displayForTeamA(teamAscore);
            }
        });
       resetButton1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               teamBscore =0;
               displayForTeamB(teamBscore);
           }

           private void displayForTeamB(int teamBscore) {scoreTeamB.setText(""+teamBscore);
           }
       });

        btnTeamA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamAscore = teamAscore + 1;
                displayForTeamA(teamAscore);
            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamAscore = 0;
                displayForTeamA(teamAscore);
            }
        });
    }

    private void displayForTeamA(int score) {
        scoreTeamA.setText("" + teamAscore);
    }




}



         



