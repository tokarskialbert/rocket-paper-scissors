package com.albert.rpsgame;

public class Battle {

    public void doTheDuel(GameStatus gameStatus, Move playerChoice, Move computerChoice) {

        if (playerChoice == computerChoice) {

            System.out.println("REMIS!");
        }
        else if (playerChoice == Move.ROCKET) {

            if (computerChoice == Move.SCISSORS || computerChoice == Move.LIZARD) {
                gameStatus.setPlayerVictories(gameStatus.getPlayerVictories() + 1);

                System.out.println("Punkty gracza: " + gameStatus.getPlayerVictories());
                System.out.println("Punkty komputera: " + gameStatus.getComputerVictories());
            } else {

                gameStatus.setComputerVictories(gameStatus.getComputerVictories() + 1);
                System.out.println("Punkty gracza: " + gameStatus.getPlayerVictories());
                System.out.println("Punkty komputera: " + gameStatus.getComputerVictories());
            }
        }

        else if (playerChoice == Move.PAPER) {

            if (computerChoice == Move.ROCKET || computerChoice == Move.SPOCK) {
                gameStatus.setPlayerVictories(gameStatus.getPlayerVictories() + 1);

                System.out.println("Punkty gracza: " + gameStatus.getPlayerVictories());
                System.out.println("Punkty komputera: " + gameStatus.getComputerVictories());
            } else {

                gameStatus.setComputerVictories(gameStatus.getComputerVictories() + 1);
                System.out.println("Punkty gracza: " + gameStatus.getPlayerVictories());
                System.out.println("Punkty komputera: " + gameStatus.getComputerVictories());
            }
        }

        else if (playerChoice == Move.SCISSORS) {

            if (computerChoice == Move.PAPER || computerChoice == Move.LIZARD) {
                gameStatus.setPlayerVictories(gameStatus.getPlayerVictories() + 1);

                System.out.println("Punkty gracza: " + gameStatus.getPlayerVictories());
                System.out.println("Punkty komputera: " + gameStatus.getComputerVictories());
            } else {

                gameStatus.setComputerVictories(gameStatus.getComputerVictories() + 1);
                System.out.println("Punkty gracza: " + gameStatus.getPlayerVictories());
                System.out.println("Punkty komputera: " + gameStatus.getComputerVictories());
            }
        }

        else if (playerChoice == Move.LIZARD) {

            if (computerChoice == Move.SPOCK || computerChoice == Move.PAPER) {
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

            if (computerChoice == Move.SCISSORS || computerChoice == Move.ROCKET) {
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
