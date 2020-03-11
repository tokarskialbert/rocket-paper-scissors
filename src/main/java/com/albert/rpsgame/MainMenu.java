package com.albert.rpsgame;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class MainMenu {

    public String getUserName() {

        System.out.println("Wpisz tutaj swoje imię: ");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.next();

        while (!result.matches("[a-zA-Z]{3,}")) {

            result = scanner.next();
        }

        return result.toLowerCase().substring(0, 1).toUpperCase() + result.substring(1);
    }

    public Integer getVictoriesToWin() {

        System.out.println("Do ilu zwycięstw gramy? Wpisz liczbę:");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.next();

        while(!result.matches("[0-9]{1,}")) {

            result = scanner.next();
        }

        return Integer.parseInt(result);
    }

    public void displayTextFromFile(String fileName) {

        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource(fileName).getFile());
            Path path = Paths.get(file.getPath());

            Stream<String> fileLines = Files.lines(path);
            fileLines.forEach(System.out::println);

        } catch (IOException ex) {

            System.err.println("ERROR! " + ex.getStackTrace());
            System.exit(1);
        }
    }
}





