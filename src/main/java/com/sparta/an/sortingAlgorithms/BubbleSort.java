package com.sparta.an.sortingAlgorithms;

import com.sparta.an.logger.LoggerSystem;
import java.util.Arrays;

public class BubbleSort implements Sorter{

    @Override
    public int[] sort(int[] array) {
        LoggerSystem.getMessage(1, "Starting Bubble Sort sorting: " + Arrays.toString(array));
        for (int loops = 0; loops < array.length - 1; loops++){
            for (int index = 0; index < array.length - 1; index++){
                numberSwapper(array, index);
            }
        }
        LoggerSystem.getMessage(4, "Bubble Sort has finished and returned: " + Arrays.toString(array));

        if (array == null){
            LoggerSystem.getMessage(5, "Array returned in Bubble Sort is null.");
        }
        return array;
    }

    private void numberSwapper(int[] array, int i) {
        int temp;
        if (array[i] > array[i+1]){
            temp = array[i];
            array[i] = array[i+1];
            LoggerSystem.getMessage(2, "Replacing using Bubble Sort  " + temp + " value with " + array[i+1] + ".");
            array[i+1] = temp;
        }
    }
}
