package com.sparta.an.sortingAlgorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortTest {
    @Test
    @DisplayName("Is sorting in correct numerical order")
    void isSortingInCorrectNumericalOrder(){
        int[] randNumbers = {5, 3, 0, 9, 11, 17, 404, 50, 58, 36, 17, 52, 5, 3};
        int[] expected = {0, 3, 3, 5, 5, 9, 11, 17, 17, 36, 50, 52, 58, 404};
        Assertions.assertEquals(Arrays.toString(expected),Arrays.toString(new MergeSort().sort(randNumbers)));
    }

    @Test
    @DisplayName("When passing negative values, returns numerical order.")
    void whenPassingNegativeValuesReturnsNumericalOrder(){
        int[] randNumbers = {5, -1, -5, 9, 11, 17, 404, 50, 58, 36, 17, 52, 0, 4};
        int[] expected = {-5, -1, 0, 4, 5, 9, 11, 17, 17, 36, 50, 52, 58, 404};
        Assertions.assertEquals(Arrays.toString(expected),Arrays.toString(new MergeSort().sort(randNumbers)));
    }

    @Test
    @DisplayName("When passing duplicates, returns sorted array")
    void whenPassingDuplicatesReturnsSortedArray(){
        int[] randNumbers = {0, -5, -5, 9, 11, 17, 404, 50, 58, 36, 17, 52, 0, 1};
        int[] expected = {-5, -5, 0, 0, 1, 9, 11, 17, 17, 36, 50, 52, 58, 404};
        Assertions.assertEquals(Arrays.toString(expected),Arrays.toString(new MergeSort().sort(randNumbers)));
    }

    @Test
    @DisplayName("When passed an array, returns correct length of the array back")
    void whenPassedAnArrayReturnsCorrectLengthOfTheArrayBack(){
        int[] randNumbers = {3, -5, -5, 9, 11, 17, 404, 50, 58, 36, 7, 17, 52, 0};
        int[] expected = {-5, -5, 3, 0, 7, 9, 11, 17, 17, 36, 50, 52, 58, 404};
        Assertions.assertEquals(expected.length,new MergeSort().sort(randNumbers).length);
    }
}
