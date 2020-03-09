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

    public Move findPlayerMove(String index) {
            return Move.getMoveMap().get(Integer.parseInt(index));
    }

    public Move findComputerMove() {
        Move computerMove = Move.getMoveMap().get(drawNumber());
        System.out.println("Komputer wybrał " + computerMove);
        return computerMove;
    }

    public String getChosenNumber() {
        return chosenNumber;
    }
}
