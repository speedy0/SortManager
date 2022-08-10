package com.sparta.an;

import com.sparta.an.loader.Loader;
import com.sparta.an.random.RandomArray;
import com.sparta.an.sortingAlgorithms.BubbleSort;
import com.sparta.an.sortingAlgorithms.Sorter;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        int[] array = RandomArray.randomArray(50);
        Sorter[] sortArrays = {new BubbleSort(), new BubbleSort()};
        Loader.sortLoader(sortArrays, array);
        System.out.println(Arrays.toString(array));
    }
}
