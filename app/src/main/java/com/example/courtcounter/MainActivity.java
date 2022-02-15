package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increases the score by 3 points
     *
     * @param view - text views of scores
     */
    public void addThreePoints(View view) {
        Button threePointsTeamA = findViewById(R.id.three_points_teamA);
        Button threePointsTeamB = findViewById(R.id.three_points_teamB);
        if (threePointsTeamA.isPressed()) {
            scoreTeamA += 3;
            displayForTeamA(scoreTeamA);
        }
        if (threePointsTeamB.isPressed()) {
            scoreTeamB += 3;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Increases the score by 2 points
     *
     * @param view - text views of scores
     */
    public void addTwoPoints(View view) {
        Button twoPointsTeamA = findViewById(R.id.two_points_teamA);
        Button twoPointsTeamB = findViewById(R.id.two_points_teamB);
        if (twoPointsTeamA.isPressed()) {
            scoreTeamA += 2;
            displayForTeamA(scoreTeamA);
        }
        if (twoPointsTeamB.isPressed()) {
            scoreTeamB += 2;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Increases the score by 1 point (Free Throw)
     *
     * @param view - text views of scores
     */
    public void addFreeThrow(View view) {
        Button freeThrowTeamA = findViewById(R.id.free_throw_teamA);
        Button freeThrowTeamB = findViewById(R.id.free_throw_teamB);
        if (freeThrowTeamA.isPressed()) {
            scoreTeamA += 1;
            displayForTeamA(scoreTeamA);
        }
        if (freeThrowTeamB.isPressed()) {
            scoreTeamB += 1;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Display the score of Team A
     *
     * @param score - score of Team A
     */
    public void displayForTeamA(int score) {
        TextView scoreViewTeamA = findViewById(R.id.team_a_score);
        scoreViewTeamA.setText(String.valueOf(score));
    }

    /**
     * Displays the score of Team B
     *
     * @param score - score of Team B
     */
    public void displayForTeamB(int score) {
        TextView scoreViewTeamB = findViewById(R.id.team_b_score);
        scoreViewTeamB.setText(String.valueOf(score));
    }

    /**
     * Resets the scores of both Teams
     *
     * @param view - text views of scores
     */
    public void resetButton(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}