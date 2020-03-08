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

        while(!((gameStatus.getVictoriesToWin() == gameStatus.getPlayerVictories()) || (gameStatus.getVictoriesToWin() == gameStatus.getComputerVictories()))) {
            userDecision.getDecisionFromPlayer();
            battle.doTheDuel(gameStatus, Move.findPlayerMove(userDecision), Move.findComputerMove(userDecision));
        }

        Summary summary = new Summary();
        System.out.println(summary.getSummary(user, gameStatus));

        System.exit(0);
    }
}
