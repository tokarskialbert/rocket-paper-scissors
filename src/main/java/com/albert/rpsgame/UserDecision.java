package com.albert.rpsgame;

import java.util.Random;
import java.util.Scanner;

public class UserDecision {

    private String chosenNumber;

    public void getDecisionFromPlayer() {
        System.out.println("\nTwoja kolej. Co wybierasz?");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.next();

        while (!result.matches("[1-5]{1}") && (!result.matches("[x]{1}")) && (!result.matches("[n]{1}"))) {

            result = scanner.next();
        }

        if(result.toLowerCase().equals("x")) {
            System.exit(0);
        }
        else if (result.toLowerCase().equals("n")) {
            Game game = new Game();
            game.doTheGame();
        }
        else {
            this.chosenNumber = result;
        }
    }

    public int drawNumber() {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }

    public String getChosenNumber() {
        return chosenNumber;
    }
}
