package com.elswefi;

public class GameLogic {
    private String answer;
    private String hits = "";
    private String misses = "";

    public GameLogic(String answer) {
        this.answer = answer;
    }

    public boolean applyGuess(char letter) {
        boolean isHit = answer.indexOf(letter) != -1;
        if (hits.indexOf(letter) != -1 && misses.indexOf(letter) != -1) {
            if (isHit) {
                hits += letter;
            } else {
                misses += letter;
            }
        }else {System.out.printf("%s has already been guessed",letter);}
        return isHit;
    }

    public String currentProgress() {
        String progress = "";
        for (char letter : answer.toCharArray()) {
            char display = '-';
            if (hits.indexOf(letter) != -1) {
                display = letter;
            }
            progress += display;
        }

        return progress;
    }
}
