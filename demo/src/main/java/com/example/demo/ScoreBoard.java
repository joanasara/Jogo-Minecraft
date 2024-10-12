package com.example.demo;


import javafx.scene.control.Label;
import lombok.Getter;

public class ScoreBoard {
    private int score;
    @Getter
    private final Label scoreLabel;

    public ScoreBoard() {
        score = 0;
        scoreLabel = new Label("Score: " + score);
    }

    public void addScore(int points) {
        score += points;
        scoreLabel.setText("Score: " + score);
    }

}
