package com.example.exam;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamApplication {

    public static void main(String[] args) {

//         câu 1: thuật toán tìm kiếm tuyến tính

        int[] arr2 = {2, 3, 4, 10, 40};
        int foundIndex = LinearSearch.search(arr2, 10);
        System.out.println("1. Linear Search (find 10): at index " + foundIndex);


//        câu 2: thuật toán sắp xếp chèn

        int[] arr1 = {5, 2, 4, 6, 1, 3, 7, 9};
        InsertionSort.insertionSort(arr1);
        System.out.print("2. Insertion Sort: ");
        for (int x : arr1) System.out.print(x + " ");
        System.out.println();

//        câu 3: thuật toán đệ quy giải bài toán tính giai thừa

        int n = 5;
        int fact = Factorial.factorial(n);
        System.out.println("3. The factorial of " + n + " is: " + fact);
    }
}
