package com.albert.rpsgame;

import java.util.Random;
import java.util.Scanner;

public class UserDecision {

    private String chosenNumber;
    private Move randomFigure;
    private Move userFigure;

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

    public Move findCorrectFigure() {
        if(this.chosenNumber.equals("1")) {
            this.userFigure = Move.ROCK;
        }
        else if(this.chosenNumber.equals("2")) {
            this.userFigure = Move.PAPER;
        }
        else if(this.chosenNumber.equals("3")) {
            this.userFigure = Move.SCISSORS;
        }
        else if(this.chosenNumber.equals("4")) {
            this.userFigure = Move.LIZARD;
        }
        else {
            this.userFigure = Move.SPOCK;
        }
        return this.userFigure;
    }

    public Move getRandomFigure() {

        Random random = new Random();
        int randomInt = random.nextInt(5) + 1;

        if(randomInt == 1) { this.randomFigure = Move.ROCK; }

        else if(randomInt == 2) { this.randomFigure = Move.PAPER; }

        else if(randomInt == 3) { this.randomFigure = Move.SCISSORS; }

        else if(randomInt == 4) { this.randomFigure = Move.LIZARD;}

        else { this.randomFigure = Move.SPOCK;}

        System.out.println("Komputer wybrał " + this.randomFigure +"\n");

        return this.randomFigure;
    }
}
