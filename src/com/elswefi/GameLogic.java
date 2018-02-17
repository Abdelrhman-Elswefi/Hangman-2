package com.elswefi;

public class GameLogic {
    private String answer;
    private String hits = "";
    private String misses = "";

    public boolean applyGuess(char letter) {
        boolean isHit = answer.indexOf(letter) != -1;
        if (isHit) {
            hits += letter;
        }else {
            misses+=letter;
        }
        return isHit;
    }
}
