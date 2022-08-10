package com.sparta.an;

import com.sparta.an.loader.Loader;
import com.sparta.an.random.RandomArray;

public class App
{
    public static void main( String[] args )
    {
        // Sorting choices - to be passed to Input for decision-making
        String[] sortingChoices = {"Bubble Sort", "Merge Sort", "Binary Tree", "Quick Sorter", "Insertion Sorter"};
        String[] sorters = InputManager.getUserChoice(sortingChoices);

        // Creation of random array
        int[] array = RandomArray.randomArray(50);
        Loader.sortLoaders(sorters, array);
    }
}
