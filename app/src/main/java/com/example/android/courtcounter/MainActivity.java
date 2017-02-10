package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int aPoints = 0;
    int bPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset(View view) {
        aPoints = 0;
        bPoints = 0;
        displayTeamA(aPoints);
        displayTeamB(bPoints);

    }


    public void teamAPLusThree(View view) {
        aPoints += 3;
        displayTeamA(aPoints);
    }

    public void teamAPLusTwo(View view) {
        aPoints += 2;
        displayTeamA(aPoints);

    }

    public void teamAPLusOne(View view) {
        aPoints += 1;
        displayTeamA(aPoints);


    }
    public void displayTeamA(int actualscore) {
        TextView score = (TextView) findViewById(R.id.team_a_points);
        score.setText(String.valueOf(actualscore));
    }

    public void displayTeamB(int actualscore) {
        TextView score = (TextView) findViewById(R.id.team_b_points);
        score.setText(String.valueOf(actualscore));
    }
    public void teamBPLusThree(View view) {
        bPoints += 3;
        displayTeamB(bPoints);
    }

    public void teamBPLusTwo(View view) {
        bPoints += 2;
        displayTeamB(bPoints);

    }

    public void teamBPLusOne(View view) {
        bPoints += 1;
        displayTeamB(bPoints);


    }


}
