package com.albert.rpsgame;

public class Summary {

    public String getSummary(User user, GameStatus gameStatus) {

        if (gameStatus.getVictoriesToWin() == gameStatus.getPlayerVictories()) {
            return "\nWYGRYWA " + user.getName().toUpperCase() +"!";
        }
        else {
            return "\nWygrywa komputer. Głowa do góry, następnym razem będzie lepiej :)";
        }
    }
}
