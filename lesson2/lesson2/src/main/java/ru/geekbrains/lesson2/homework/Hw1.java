package ru.geekbrains.lesson2.homework;

public class Hw1 {
    public static void main(String args[]) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        HeapSort heapSort = new HeapSort();
        heapSort.heapSort(arr);

        System.out.println("Отсортированный массив:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}