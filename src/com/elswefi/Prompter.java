package com.elswefi;

import java.util.Scanner;

public class Prompter {
    GameLogic mGameLogic;

    public Prompter(GameLogic gameLogic) {
        mGameLogic = gameLogic;
    }

    public void promptForGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter a letter :\n");
        String guessInput = scanner.nextLine();
        char guess = guessInput.charAt(0);
        try {
            boolean isHit = mGameLogic.applyGuess(guess);
            if (isHit) {
                System.out.print("we got a hit !");
            } else {
                System.out.print("oops! you missed");
            }
        } catch (IllegalArgumentException iae) {
            System.out.print(iae.getMessage());
        }

    }

    public void displayProgress() {
        System.out.printf("\nyou have %d tries left to solve :%s\n"
                , mGameLogic.remainingTries()
                , mGameLogic.currentProgress());
    }

}
