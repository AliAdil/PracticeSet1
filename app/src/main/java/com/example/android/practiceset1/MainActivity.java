package com.example.android.practiceset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int score = 0;
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void one (View view){
        score += 1;
        displayForTeamA(score);
    }
    public void two (View view){
        score += 2;
        displayForTeamA(score);
    }
    public void  three(View view){
        score += 3;
        displayForTeamA(score);
    }
}
