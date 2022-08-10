package com.sparta.an;

import com.sparta.an.print.PrintingResults;
import com.sparta.an.print.TimerPrint;
import com.sparta.an.random.RandomArray;
import com.sparta.an.sortingAlgorithms.BubbleSort;

public class App
{
    public static void main( String[] args )
    {
        //Creation of an object - to be deleted.
        BubbleSort bubble = new BubbleSort();

        int[] randArray = RandomArray.randomArray(100);
        PrintingResults.printStartArray(randArray);
        double start = System.nanoTime();
        PrintingResults.printEndArray(bubble.sort(randArray));
        double end = System.nanoTime();
        TimerPrint.printTimer(start, end);
    }
}
