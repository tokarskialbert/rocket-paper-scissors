package com.albert.rpsgame;

public class Game {

    public void doTheGame() {
        System.out.println("Cześć!");
        MainMenu mainMenu = new MainMenu();
        mainMenu.displayGameDescription();
        User user = new User(mainMenu.getUserName());
        GameStatus gameStatus = new GameStatus(mainMenu.getVictoriesNumberToWinTheGame());
        mainMenu.displayGameRules();
        DecisionGetter decisionGetter = new DecisionGetter();

        Battle battle = new Battle();

        while(!(gameStatus.getVictoriesToWinTheGame() == gameStatus.getPlayerVictories() ||
                gameStatus.getVictoriesToWinTheGame() == gameStatus.getComputerVictories())) {

            decisionGetter.getDecisionFromPlayer();
            battle.doTheDuel(gameStatus, decisionGetter.findCorrectFigure(), decisionGetter.getRandomFigure());
        }

        Summary summary = new Summary();
        System.out.println(summary.getSummary(user, gameStatus));

        System.exit(0);
    }
}
