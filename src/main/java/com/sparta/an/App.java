package com.sparta.an;

import com.sparta.an.display.scanner.InputScanner;
import com.sparta.an.loader.Loader;
import com.sparta.an.random.RandomArray;
import com.sparta.an.sortingAlgorithms.BubbleSort;
import com.sparta.an.sortingAlgorithms.Sorter;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        String[] sortingChoices = {"Bubble Sort", "Merge Sort", "Binary Tree", "Quick Sorter", "Insertion Sorter"};
        int choice = InputScanner.userInput(sortingChoices);
        System.out.println(choice);
        int[] array = RandomArray.randomArray(50);
        Sorter[] sortArrays = {new BubbleSort()};
        Loader.sortLoader(sortArrays, array);
        System.out.println(Arrays.toString(array));
    }
}
