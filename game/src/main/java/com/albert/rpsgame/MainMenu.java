package com.albert.rpsgame;

import java.util.Scanner;

public class MainMenu {

    public String getUserName() {

        System.out.println("Hello. Enter here your name: ");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.next();

        while(!result.matches("[a-zA-Z]{3,}")) {

            result = scanner.next();
        }

        return result.toLowerCase().substring(0, 1).toUpperCase() + result.substring(1);
    }
}
