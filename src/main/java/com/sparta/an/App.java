package com.sparta.an;

import com.sparta.an.random.RandomArray;
import com.sparta.an.sortingAlgorithms.BubbleSort;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        //Creation of an object - to be deleted.
        BubbleSort bubble = new BubbleSort();

        int[] randArray = RandomArray.randomArray(100);
        System.out.println("Array before bubbleSort: " + Arrays.toString(randArray));
        double start = System.nanoTime();
        System.out.println("Array after bubbleSort: " + Arrays.toString(bubble.sort(randArray)));
        double end = System.nanoTime();
        System.out.println("Time taken for BubbleSort: " + ((end-start) / 10000));
    }
}
