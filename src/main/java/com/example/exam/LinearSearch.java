package com.example.exam;

public class LinearSearch {
    public static int search (int[] arr, int var) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == var) {
                return i;
            }
        }
        return -1;
    }
}
