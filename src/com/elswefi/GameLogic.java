package com.elswefi;

public class GameLogic {
    private String answer;

    public String getAnswer() {
        return answer;
    }

    private final static int MAX_TRIES=7;
    private String hits = "";
    private String misses = "";

    public GameLogic(String answer) {
        this.answer = answer;
    }

    public boolean applyGuess(char letter) {
        if (hits.indexOf(letter) != -1 || misses.indexOf(letter) != -1) {
            throw new IllegalArgumentException(letter + " has already been " +
                    "guessed");
        }
        boolean isHit = answer.indexOf(letter) != -1;

        if (isHit) {
            hits += letter;
        } else {
            misses += letter;
        }

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

    public int remainingTries (){
        return MAX_TRIES-misses.length();

    }
    public boolean isWon (){
        return currentProgress().indexOf('-')==-1;
    }
}
