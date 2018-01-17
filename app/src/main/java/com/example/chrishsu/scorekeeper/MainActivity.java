package com.example.chrishsu.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int homeScore = 0;
    int homeBallScore = 0;
    int homeStrikeScore = 0;
    int homeOutScore = 0;

    int guestScore = 0;
    int guestBallScore = 0;
    int guestStrikeScore = 0;
    int guestOutScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
