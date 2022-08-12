package com.sparta.an.display.print;

import com.sparta.an.sortingAlgorithms.Sorter;

public class TimerPrint {
    public static void printTimer(Sorter sorter, double start, double end){
        String className = sorter.getClass().toString().replace("com.sparta.an.sortingAlgorithms.", "");
        System.out.println("Time taken for " + className +": " + ((end - start) / 1000000));
    }
}
