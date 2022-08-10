package com.sparta.an.loader;

import com.sparta.an.print.PrintingResults;
import com.sparta.an.print.TimerPrint;
import com.sparta.an.random.RandomArray;
import com.sparta.an.runner.Runner;
import com.sparta.an.sortingAlgorithms.BubbleSort;
import com.sparta.an.sortingAlgorithms.Sorter;

public class Loader {
    public static void sortLoader(Sorter[] sorters, int[] array){
        for (Sorter sorter: sorters){
            int[] cloneArray = array.clone();
            Runner.sortRunner(sorter, cloneArray);
        }
    }
}
