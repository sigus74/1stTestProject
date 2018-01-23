package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void displayA(int score) {
        TextView scoreATextView = (TextView)findViewById(R.id.scoreA_text_view);
        scoreATextView.setText(String.valueOf(score));
    }

    public void incrementA3(View view) {
        scoreA = scoreA + 3;
        displayA(scoreA);
    }

    public void incrementA2(View view)
    {
        scoreA=scoreA+2;
        displayA(scoreA);
    }

    public void incrementA1(View view)
    {
        scoreA=scoreA+1;
        displayA(scoreA);
    }

    private void displayB(int score)
    {
        TextView scoreBTextView=(TextView)findViewById(R.id.scoreB_text_view);
        scoreBTextView.setText(String.valueOf(score));
    }

    public void incrementB3(View view) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }

    public void incrementB2(View view)
    {
        scoreB=scoreB+2;
        displayB(scoreB);
    }

    public void incrementB1(View view)
    {
        scoreB=scoreB+1;
        displayB(scoreB);
    }

    public void reset(View view)
    {
        scoreA=0;
        scoreB=0;
        displayA(scoreA);
        displayB(scoreB);
    }




}
