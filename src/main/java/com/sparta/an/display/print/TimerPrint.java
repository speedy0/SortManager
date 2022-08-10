package com.sparta.an.display.print;

public class TimerPrint {
    public static void printTimer(double start, double end){
        System.out.println("Time taken for BubbleSort: " + ((end - start) / 1000000));
    }
}
