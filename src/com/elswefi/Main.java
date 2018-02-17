package com.elswefi;

public class Main {

    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic("java");
        Prompter prompter = new Prompter(gameLogic);
        while (gameLogic.remainingTries() > 0&& !gameLogic.isWon()) {
            prompter.displayProgress();
            prompter.promptForGuess();
        }
        prompter.displayResult();


    }
}
