package com.albert.rpsgame;

public class GameStatus {

    private int victoriesToWin;
    private int playerVictories = 0;
    private int computerVictories = 0;


    public GameStatus(int victoriesToWin) {
        this.victoriesToWin = victoriesToWin;
    }

    public int getVictoriesToWin() {
        return victoriesToWin;
    }

    public int getPlayerVictories() {
        return playerVictories;
    }

    public int getComputerVictories() {
        return computerVictories;
    }

    public void incrementPlayerVictories() {
        this.playerVictories++;
    }

    public void incrementComputerVictories() {
        this.computerVictories++;
    }
}
