package com.sparta.an.sortingAlgorithms;

import java.util.Arrays;

public class MergeSort implements Sorter{
    @Override
    public int[] sort(int[] array) {
        int[] array1 = new int[array.length / 2];
        int[] array2 = new int[array1.length];

        // Splits passed in array equally to two different arrays.
        splitToArrays(array, array1, array2);

        // Sorting using Java algorithm to obtain two sorted methods.
        Arrays.sort(array1);
        Arrays.sort(array2);

        int[] sortedArray = new int[array.length];

        int currArr1Ind = 0;
        int currArr2Ind = 0;

        mergeArray(array1, array2, array.length, sortedArray, currArr1Ind, currArr2Ind);
        return sortedArray;
    }

    private static void splitToArrays(int[] array, int[] array1, int[] array2) {
        int arr2Index = 0;
        for (int i = 0; i <= array.length - 1; i++){
            if (i <= (array.length - 1) / 2){
                array1[i] = array[i];
            } else {
                array2[arr2Index] = array[i];
                arr2Index++;
            }
        }
    }

    private static void mergeArray(int[] array1, int[] array2, int arrayLengths, int[] sortedArray, int currArr1Ind, int currArr2Ind) {
        for (int sortArrayIndex = 0; sortArrayIndex <= arrayLengths - 1; sortArrayIndex++){
            if (currArr1Ind > array1.length - 1){
                sortedArray[sortArrayIndex] = array2[currArr2Ind];
                currArr2Ind++;
            } else if (currArr2Ind > array2.length - 1){
                sortedArray[sortArrayIndex] = array1[currArr1Ind];
                currArr1Ind++;
            } else if (array1[currArr1Ind] < array2[currArr2Ind]){
                sortedArray[sortArrayIndex] = array1[currArr1Ind];
                currArr1Ind++;
            } else if (array2[currArr2Ind] < array1[currArr1Ind]){
                sortedArray[sortArrayIndex] = array2[currArr2Ind];
                currArr2Ind++;
            } else {
                sortedArray[sortArrayIndex] = array1[currArr1Ind];
                currArr1Ind++;
            }
        }
    }
}
