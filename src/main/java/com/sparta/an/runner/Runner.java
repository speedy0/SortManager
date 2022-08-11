package com.sparta.an.runner;

import com.sparta.an.display.print.PrintingResults;
import com.sparta.an.display.print.TimerPrint;
import com.sparta.an.sortingAlgorithms.Sorter;

public class Runner {
    public static void sortRunner(Sorter sorter, int[] array){
        PrintingResults.printStartArray(array);
        double start = System.nanoTime();
        PrintingResults.printEndArray(sorter.sort(array));
        double end = System.nanoTime();
        TimerPrint.printTimer(sorter, start, end);
    }
}
