package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * increase score by 1 points
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }


    /**
     * increase score by 2 points
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * increase score by 3 points
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * increase score by 1 points
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }


    /**
     * increase score by 2 points
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * increase score by 3 points
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * reset both scores
     */
    public void Reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamB);
        displayForTeamB(scoreTeamB);
    }

}
