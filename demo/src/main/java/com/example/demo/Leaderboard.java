package com.example.demo;



import java.util.ArrayList;
import java.util.Collections;

public class Leaderboard {
    private final ArrayList<String> scores = new ArrayList<>();

    public void addScore(String playerName, int score) {
        scores.add(playerName + ": " + score);
        Collections.sort(scores); // Ordenar pontuações
    }

    public ArrayList<String> getScores() {
        return scores;
    }
}
