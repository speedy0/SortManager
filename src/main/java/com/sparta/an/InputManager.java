package com.sparta.an;

import com.sparta.an.display.scanner.InputScanner;
import com.sparta.an.sortingAlgorithms.MergeSort;

public class InputManager {
    public static String[] getUserChoice(String[] userChoices){
        int userChoice = InputScanner.userInput(userChoices);

        switch (userChoice){
            case (1) -> {
                return new String[]{"BubbleSort"};
            } case (2) -> {
                return new String[]{"MergeSort"};
            } case (3) -> {
                return new String[]{"InsertionSort"};
            } case (4) -> {
                return new String[]{"BinaryTree"};
            } case (5) -> {
                return new String[]{"QuickSort"};
            } default -> {
                return new String[]{"BubbleSort", "MergeSort", "InsertionSort", "BinaryTree", "QuickSort"};
            }
        }
    }
}
