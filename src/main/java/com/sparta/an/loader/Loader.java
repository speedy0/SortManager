package com.sparta.an.loader;

import com.sparta.an.runner.Runner;
import com.sparta.an.sortingAlgorithms.*;

public class Loader {
    public static void sortLoaders(String[] sorterOptions, int[] array){
        Sorter[] sorters = new Sorter[sorterOptions.length];

        for (int i = 0; i <= sorterOptions.length -1; i++){
            switch (sorterOptions[i]){
                case "BubbleSort" -> sorters[i] = new BubbleSort();
                case "MergeSort" -> sorters[i] = new MergeSort();
                case "InsertionSort" -> sorters[i] = new InsertionSort();
                case "BinaryTree" -> sorters[i] = new BinaryTree();
                case "QuickSorter" -> sorters[i] = new QuickSort();
                default -> sorters[i] = null; // For an error
            }
        }
        sortLoader(sorters, array);
    }

    private static void sortLoader(Sorter[] sorters, int[] array){
        for (Sorter sorter: sorters){
            int[] cloneArray = array.clone();
            Runner.sortRunner(sorter, cloneArray);
        }
    }
}
