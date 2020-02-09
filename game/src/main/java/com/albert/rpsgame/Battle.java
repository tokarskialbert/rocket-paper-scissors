package com.albert.rpsgame;

import com.albert.ENUM.RPSoptions;

public class Battle {

    public void doTheDuel(GameStatus gameStatus, RPSoptions playerChoice, RPSoptions computerChoice) {

        if (playerChoice == computerChoice) {

            System.out.println("REMIS!");
        }
        else if (playerChoice == RPSoptions.ROCKET) {

            if (computerChoice == RPSoptions.SCISSORS || computerChoice == RPSoptions.LIZARD) {
                gameStatus.setPlayerVictories(gameStatus.getPlayerVictories() + 1);

                System.out.println("Punkty gracza: " + gameStatus.getPlayerVictories());
                System.out.println("Punkty komputera: " + gameStatus.getComputerVictories());
            } else {

                gameStatus.setComputerVictories(gameStatus.getComputerVictories() + 1);
                System.out.println("Punkty gracza: " + gameStatus.getPlayerVictories());
                System.out.println("Punkty komputera: " + gameStatus.getComputerVictories());
            }
        }

        else if (playerChoice == RPSoptions.PAPER) {

            if (computerChoice == RPSoptions.ROCKET || computerChoice == RPSoptions.SPOCK) {
                gameStatus.setPlayerVictories(gameStatus.getPlayerVictories() + 1);

                System.out.println("Punkty gracza: " + gameStatus.getPlayerVictories());
                System.out.println("Punkty komputera: " + gameStatus.getComputerVictories());
            } else {

                gameStatus.setComputerVictories(gameStatus.getComputerVictories() + 1);
                System.out.println("Punkty gracza: " + gameStatus.getPlayerVictories());
                System.out.println("Punkty komputera: " + gameStatus.getComputerVictories());
            }
        }

        else if (playerChoice == RPSoptions.SCISSORS) {

            if (computerChoice == RPSoptions.PAPER || computerChoice == RPSoptions.LIZARD) {
                gameStatus.setPlayerVictories(gameStatus.getPlayerVictories() + 1);

                System.out.println("Punkty gracza: " + gameStatus.getPlayerVictories());
                System.out.println("Punkty komputera: " + gameStatus.getComputerVictories());
            } else {

                gameStatus.setComputerVictories(gameStatus.getComputerVictories() + 1);
                System.out.println("Punkty gracza: " + gameStatus.getPlayerVictories());
                System.out.println("Punkty komputera: " + gameStatus.getComputerVictories());
            }
        }

        else if (playerChoice == RPSoptions.LIZARD) {

            if (computerChoice == RPSoptions.SPOCK || computerChoice == RPSoptions.PAPER) {
                gameStatus.setPlayerVictories(gameStatus.getPlayerVictories() + 1);

                System.out.println("Punkty gracza: " + gameStatus.getPlayerVictories());
                System.out.println("Punkty komputera: " + gameStatus.getComputerVictories());
            } else {

                gameStatus.setComputerVictories(gameStatus.getComputerVictories() + 1);
                System.out.println("Punkty gracza: " + gameStatus.getPlayerVictories());
                System.out.println("Punkty komputera: " + gameStatus.getComputerVictories());
            }
        }

        else {

            if (computerChoice == RPSoptions.SCISSORS || computerChoice == RPSoptions.ROCKET) {
                gameStatus.setPlayerVictories(gameStatus.getPlayerVictories() + 1);

                System.out.println("Punkty gracza: " + gameStatus.getPlayerVictories());
                System.out.println("Punkty komputera: " + gameStatus.getComputerVictories());
            } else {

                gameStatus.setComputerVictories(gameStatus.getComputerVictories() + 1);
                System.out.println("Punkty gracza: " + gameStatus.getPlayerVictories());
                System.out.println("Punkty komputera: " + gameStatus.getComputerVictories());
            }
        }
    }
}
