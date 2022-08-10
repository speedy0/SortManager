package com.sparta.an.display.scanner;

import com.sparta.an.display.print.Choices;

import java.util.Scanner;

public class InputScanner {
    public static int userInput(String[] sorterChoices){
        Scanner scanner = new Scanner(System.in);
        Choices.printChoices(sorterChoices);
        System.out.println("Please make your choice by putting number below:");
        int choice = scanner.nextInt();
        return choice;
    }
}
