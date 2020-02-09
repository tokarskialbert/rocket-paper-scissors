package com.albert.rpsgame;

import com.albert.ENUM.RPSoptions;

import java.util.Random;
import java.util.Scanner;

public class DecisionGetter {

    private String choosenNumber;
    private RPSoptions randomFigure;

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

    public RPSoptions findCorrectFigure() {

        if(this.choosenNumber.equals("1")) {
            return RPSoptions.ROCKET;
        }
        else if(this.choosenNumber.equals("2")) {
            return RPSoptions.PAPER;
        }
        else if(this.choosenNumber.equals("3")) {
            return RPSoptions.SCISSORS;
        }
        else if(this.choosenNumber.equals("4")) {
            return RPSoptions.LIZARD;
        }
        else {
            return RPSoptions.SPOCK;
        }
    }

    public RPSoptions getRandomFigure() {

        Random random = new Random();
        int randomInt = random.nextInt(5) + 1;

        if(randomInt == 1) {
            System.out.println("Komputer wybrał kamień \n");
            this.randomFigure = RPSoptions.ROCKET;
        }

        else if(randomInt == 2) {
            System.out.println("Komputer wybrał papier \n");
            this.randomFigure = RPSoptions.PAPER;
        }

        else if(randomInt == 3) {
            System.out.println("Komputer wybrał nożyce \n");
            this.randomFigure = RPSoptions.SCISSORS;
        }

        else if(randomInt == 4) {
            System.out.println("Komputer wybrał jaszczurkę \n");
            this.randomFigure = RPSoptions.LIZARD;
        }

        else {
            System.out.println("Komputer wybrał Spock'a \n");
            this.randomFigure = RPSoptions.SPOCK;
        }

        return this.randomFigure;
    }
}
