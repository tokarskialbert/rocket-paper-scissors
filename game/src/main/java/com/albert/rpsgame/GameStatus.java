package com.albert.rpsgame;

public class GameStatus {

    private int victoriesToWinTheGame;
    private int playerVictories = 0;
    private int computerVictories = 0;


    public GameStatus(int victoriesToWinTheGame) {
        this.victoriesToWinTheGame = victoriesToWinTheGame;
    }

    public int getVictoriesToWinTheGame() {
        return victoriesToWinTheGame;
    }

    public int getPlayerVictories() {
        return playerVictories;
    }

    public int getComputerVictories() {
        return computerVictories;
    }

    public void setPlayerVictories(int playerVictories) {
        this.playerVictories = playerVictories;
    }

    public void setComputerVictories(int computerVictories) {
        this.computerVictories = computerVictories;
    }
}
