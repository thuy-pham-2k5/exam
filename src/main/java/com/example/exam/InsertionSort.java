package com.example.exam;

public class InsertionSort {
    public static void insertionSort(int[] arrs) {
        for (int i = 1; i < arrs.length; i++) {
            int valueToInsert = arrs[i];
            int holePosition = i;
            while (holePosition > 0 && arrs[holePosition - 1] > valueToInsert) {
                arrs[holePosition] = arrs[holePosition - 1];
                holePosition--;
            }
            arrs[holePosition] = valueToInsert;
        }
    }
}
