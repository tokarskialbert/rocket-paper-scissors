package com.albert.rpsgame;

public class Battle {

    public void doTheDuel(GameStatus gameStatus, Move playerChoice, Move computerChoice) {

        if (playerChoice == computerChoice) {
            System.out.println("REMIS!");
        }

        else {
            if(playerChoice.beats(computerChoice)) {
                gameStatus.setPlayerVictories(gameStatus.getPlayerVictories() + 1);
            }
            else {
                gameStatus.setComputerVictories(gameStatus.getComputerVictories() + 1);
            }
        }

        System.out.println("Punkty gracza: " + gameStatus.getPlayerVictories());
        System.out.println("Punkty komputera: " + gameStatus.getComputerVictories());
    }
}
