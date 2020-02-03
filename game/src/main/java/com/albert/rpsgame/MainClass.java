package com.albert.rpsgame;

public class MainClass {
    public static void main(String[] args) {

        MainMenu mainMenu = new MainMenu();
        User user = new User(mainMenu.getUserName());
    }
}
