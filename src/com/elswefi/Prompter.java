package com.elswefi;

import java.util.Scanner;

public class Prompter {
    GameLogic mGameLogic;

    public Prompter(GameLogic gameLogic) {
        mGameLogic = gameLogic;
    }

    public void promptForGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter a letter :");
        String guessInput = scanner.nextLine();
        try {
            mGameLogic.applyGuess(guessInput);
        } catch (IllegalArgumentException iae) {
            System.out.print(iae.getMessage());
        }

    }

    public void displayProgress() {
        System.out.printf("\nyou have %d tries left to solve :%s\n"
                , mGameLogic.remainingTries()
                , mGameLogic.currentProgress());
    }

    public void displayResult() {
        if (mGameLogic.isWon()) {
            System.out.printf("congratulations, the answer is %s " +
                    "and you did it with %d tries remaining !", mGameLogic
                    .getAnswer(), mGameLogic.remainingTries());
        } else {
            System.out.printf("bummer , the answer was : %s", mGameLogic
                    .getAnswer());
        }
    }

}
