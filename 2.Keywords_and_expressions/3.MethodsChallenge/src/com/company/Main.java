package com.company;

public class Main {

    public static void main(String[] args) {
        int position1 = calculateHighScore(1000);
        int position2 = calculateHighScore(900);
        int position3 = calculateHighScore(400);
        int position4 = calculateHighScore(50);

        displayHighScorePosition("Wayne Rooney", position1);
        displayHighScorePosition("Juan Mata", position2);
        displayHighScorePosition("Zlatan Ibrahimovic", position3);
        displayHighScorePosition("Rashford", position4);
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into the position " + position + " on the high score table!");
    }

    public static int calculateHighScore(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }
}
