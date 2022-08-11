package com.sparta.an.display.print;

import com.sparta.an.sortingAlgorithms.Sorter;

public class TimerPrint {
    public static void printTimer(Sorter sorter, double start, double end){
        System.out.println("Time taken for " + sorter +": " + ((end - start) / 1000000));
    }
}
