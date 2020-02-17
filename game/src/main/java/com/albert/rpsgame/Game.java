package com.albert.rpsgame;

public class Game {

    public void doTheGame() {
        System.out.println("Cześć!");

        MainMenu mainMenu = new MainMenu();
        mainMenu.displayTextFromFile("gameDescription.txt");
        User user = new User(mainMenu.getUserName());
        GameStatus gameStatus = new GameStatus(mainMenu.getVictoriesToWin());
        mainMenu.displayTextFromFile("gameRules.txt");
        UserDecision userDecision = new UserDecision();
        Battle battle = new Battle();
        boolean endOfTheGame = gameStatus.getVictoriesToWin() == gameStatus.getPlayerVictories() || gameStatus.getVictoriesToWin() == gameStatus.getComputerVictories();

        while(!endOfTheGame) {

            userDecision.getDecisionFromPlayer();
            battle.doTheDuel(gameStatus, userDecision.findCorrectFigure(), userDecision.getRandomFigure());
        }

        Summary summary = new Summary();
        System.out.println(summary.getSummary(user, gameStatus));

        System.exit(0);
    }
}
