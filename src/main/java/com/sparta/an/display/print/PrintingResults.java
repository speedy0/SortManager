package com.sparta.an.display.print;

import java.util.Arrays;

public class PrintingResults {
    public static void printStartArray(int[] array){
        System.out.println("The unsorted array is: " + Arrays.toString(array));
    }

    public static void printEndArray(int[] array){
        System.out.println("The sorted array is: " + Arrays.toString(array));
    }
}
