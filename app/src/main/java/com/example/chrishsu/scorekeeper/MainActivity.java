package com.example.chrishsu.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

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

    /**
     * Button click : Home Score
     */
    public void button_home_score(View view) {
        homeScore = homeScore + 1;
        displayForTeamHome(homeScore);
    }

    /**
     * Button click : Home Ball Score
     */
    public void button_home_ball(View view) {
        // Make sure Ball Score doesn't go more than 3
        if (homeBallScore < 3) {
            homeBallScore = homeBallScore + 1;
        }
        displayForTeamHomeBall(homeBallScore);
    }

    /**
     * Button click : Home Strike Score
     */
    public void button_home_strike(View view) {
        // Make sure Strike score doesn't go more than 2
        if (homeStrikeScore < 2) {
            homeStrikeScore = homeStrikeScore + 1;
        }
        displayForTeamHomeStrike((homeStrikeScore));
    }

    /**
     * Button click : Home Out Score
     */
    public void button_home_out(View view){
        //Make sure Out score doesn't go more than 2
        if (homeOutScore < 2) {
            homeOutScore = homeOutScore + 1;
        }
        displayForTeamHomeOut(homeOutScore);
    }

    /**
     * Button click : Guest Score
     */
    public void button_guest_score (View view) {
        guestScore = guestScore + 1;
        displayForTeamGuest(guestScore);
    }

    /**
     * Button click : Guest Ball Score
     */
    public void button_guest_ball(View view) {
        // Make sure Ball Score doesn't go more than 3
        if (guestBallScore < 3) {
            guestBallScore = guestBallScore + 1;
        }
        displayForTeamGuestBall(guestBallScore);
    }

    /**
     * Button click : Guest Strike Score
     */
    public void button_guest_strike(View view) {
        // Make sure Strike score doesn't go more than 2
        if (guestStrikeScore < 2) {
            guestStrikeScore = guestStrikeScore + 1;
        }
        displayForTeamGuestStrike(guestStrikeScore);
    }

    /**
     * Button click : Guest Out Score
     */
    public void button_guest_out(View view){
        // Make sure Out score doesn't go more than 2
        if (guestOutScore < 2) {
            guestOutScore = guestOutScore + 1;
        }
        displayForTeamGuestOut(guestOutScore);
    }

    /**
     * Button click : Reset all scores
     */
    public void button_reset_all(View view) {
        // Reset all vars
        homeScore = 0;
        homeBallScore = 0;
        homeStrikeScore = 0;
        homeOutScore = 0;

        guestScore = 0;
        guestBallScore = 0;
        guestStrikeScore = 0;
        guestOutScore = 0;

        // Display new value
        displayForTeamHome(homeScore);
        displayForTeamHomeBall(homeBallScore);
        displayForTeamHomeStrike(homeStrikeScore);
        displayForTeamHomeOut(homeOutScore);

        displayForTeamGuest(guestScore);
        displayForTeamGuestBall(guestBallScore);
        displayForTeamGuestStrike(guestStrikeScore);
        displayForTeamGuestOut(guestOutScore);
    }

    /**
     * Display for Team Home
     */
    public void displayForTeamHome(int score) {
        TextView scoreViewTeamHome = findViewById(R.id.team_home_score);
        scoreViewTeamHome.setText(String.valueOf(score));
    }

    /**
     * Display for Team Home (Ball) Score
     */
    public void displayForTeamHomeBall(int score) {
        TextView scoreViewTeamHomeBall = findViewById(R.id.team_home_ball_score);
        scoreViewTeamHomeBall.setText(String.valueOf(score));
    }

    /**
     * Display for Team Home (Strike) Score
     */
    public void displayForTeamHomeStrike(int score) {
        TextView scoreViewTeamHomeStrike = findViewById(R.id.team_home_strike_score);
        scoreViewTeamHomeStrike.setText(String.valueOf(score));
    }

    /**
     * Display for Team Home (Out) Score
     */
    public void displayForTeamHomeOut(int score) {
        TextView scoreViewTeamHomeOut = findViewById(R.id.team_home_out_score);
        scoreViewTeamHomeOut.setText(String.valueOf(score));
    }


    /**
     * Display for Team Guest
     */
    public void displayForTeamGuest(int score) {
        TextView scoreViewTeamGuest = findViewById(R.id.team_guest_score);
        scoreViewTeamGuest.setText(String.valueOf(score));
    }

    /**
     * Display for Team Guest (Ball) Score
     */
    public void displayForTeamGuestBall(int score) {
        TextView scoreViewTeamGuestBall = findViewById(R.id.team_guest_ball_score);
        scoreViewTeamGuestBall.setText(String.valueOf(score));
    }

    /**
     * Display for Team Guest (Strike) Score
     */
    public void displayForTeamGuestStrike(int score) {
        TextView scoreViewTeamGuestStrike = findViewById(R.id.team_guest_strike_score);
        scoreViewTeamGuestStrike.setText(String.valueOf(score));
    }

    /**
     * Display for Team Guest (Out) Score
     */
    public void displayForTeamGuestOut(int score) {
        TextView scoreViewTeamGuestOut = findViewById(R.id.team_guest_out_score);
        scoreViewTeamGuestOut.setText(String.valueOf(score));
    }


}
