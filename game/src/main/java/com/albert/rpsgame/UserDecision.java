package com.albert.rpsgame;

import java.util.Random;
import java.util.Scanner;

public class UserDecision {

    private String choosenNumber;
    private Move randomFigure;

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
            this.choosenNumber = result;
        }
    }

    public Move findCorrectFigure() {

        if(this.choosenNumber.equals("1")) {
            return Move.ROCKET;
        }
        else if(this.choosenNumber.equals("2")) {
            return Move.PAPER;
        }
        else if(this.choosenNumber.equals("3")) {
            return Move.SCISSORS;
        }
        else if(this.choosenNumber.equals("4")) {
            return Move.LIZARD;
        }
        else {
            return Move.SPOCK;
        }
    }

    public Move getRandomFigure() {

        Random random = new Random();
        int randomInt = random.nextInt(5) + 1;

        if(randomInt == 1) {
            System.out.println("Komputer wybrał kamień \n");
            this.randomFigure = Move.ROCKET;
        }

        else if(randomInt == 2) {
            System.out.println("Komputer wybrał papier \n");
            this.randomFigure = Move.PAPER;
        }

        else if(randomInt == 3) {
            System.out.println("Komputer wybrał nożyce \n");
            this.randomFigure = Move.SCISSORS;
        }

        else if(randomInt == 4) {
            System.out.println("Komputer wybrał jaszczurkę \n");
            this.randomFigure = Move.LIZARD;
        }

        else {
            System.out.println("Komputer wybrał Spock'a \n");
            this.randomFigure = Move.SPOCK;
        }

        return this.randomFigure;
    }
}
