package com.example.android.practiceset1;

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

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Team A Buttons.
     */
    public void addOnePointA (View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoPointA (View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void addThreePointA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }


    /**
     * Team B Buttons.
     */
    public void addOnePointB (View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoPointB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    public void addThreePointB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    // Reset Function

    public void resetScore (){
        scoreTeamA = 0;
        scoreTeamB = 0;
    }
}
