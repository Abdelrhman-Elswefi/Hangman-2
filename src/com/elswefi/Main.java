package com.elswefi;

public class Main {

    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic("java");
        Prompter prompter = new Prompter(gameLogic);
        prompter.displayProgress();
        prompter.promptForGuess();


    }
}
