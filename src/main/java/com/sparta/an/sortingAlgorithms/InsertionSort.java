package com.sparta.an.sortingAlgorithms;

import com.sparta.an.logger.LoggerSystem;

import java.util.Arrays;

public class InsertionSort implements Sorter{
    @Override
    public int[] sort(int[] array) {
        int arrLength = array.length;
        LoggerSystem.getMessage(1, "Starting Insertion Sort sorting: " + Arrays.toString(array));
        for (int loops = 1; loops < arrLength; ++loops){
            int key = array[loops];
            int index = loops - 1;

            while (index >= 0 && array[index] > key){
                array[index + 1] = array[index];
                index -= 1;
            }
            array[index + 1] = key;
        }

        LoggerSystem.getMessage(4, "Insertion Sort has finished and returned: " + Arrays.toString(array));

        if (array == null){
            LoggerSystem.getMessage(5, "Array returned in Bubble Sort is null.");
        }

        return array;
    }
}
