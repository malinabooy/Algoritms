package ru.geekbrains.lesson1.example;

import java.util.Scanner;
/*
Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N.
Согласно свойствам линейной сложности, количество итераций цикла будет
линейно изменяться относительно изменения размера N.
 */
public class Ex1 {
    public static int sumNumbers(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        int result = sumNumbers(N);
        System.out.println("Сумма всех чисел от 1 до " + N + " равна: " + result);
    }
}
