package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is = " + finalScore);
        gameOver = false;
        score = 1000;
        levelCompleted = 5;
        bonus = 100;
        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is = " + finalScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score * (levelCompleted + bonus);
            return finalScore;
        }
        return -1;
    }
}