package com.sparta.an.inputManager;

import com.sparta.an.display.scanner.InputScanner;
import com.sparta.an.logger.LoggerSystem;

public class InputManager {
    public static String[] getUserChoice(String[] userChoices){
        if (userChoices.length == 0){
            LoggerSystem.getMessage(5, "Choices for possible sorters passed are empty.");
        }

        int userChoice = InputScanner.userInput(userChoices);

        LoggerSystem.getMessage(4, "User has input " + userChoice);

        switch (userChoice){
            case (1) -> {
                return new String[]{"BubbleSort"};
            } case (2) -> {
                return new String[]{"MergeSort"};
            } case (3) -> {
                return new String[]{"BinaryTree"};
            } case (4) -> {
                return new String[]{"InsertionSort"};
            } default -> {
                return new String[]{"BubbleSort", "MergeSort", "InsertionSort", "BinaryTree"};
            }
        }
    }
}
