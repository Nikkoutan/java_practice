package com.max.idea;

import java.util.Scanner;

public class DZ10 {
    /*пользователь вводит данные с клавиатуры в матрицу,
     а после этого произведите вывод первой строки матрицы на экран,
     где каждый элемент умножается на 3.
     Размерность матрицы задается пользователем.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число столбцов массива: ");
        int col = sc.nextInt();
        System.out.println("Введите число строк массива: ");
        int str = sc.nextInt();
        double[][] arr = new double[str][col];//задаём двумерный массив указанного размера
        for (int i = 0; i < str; i++) {
            System.out.println("Введите данные для " + (i + 1) + "-й строки, (" + col + " шт.):");
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextDouble();//ввод данных с клавиатуры и сохранение в массив
            }
        }
        for (int j = 0; j < col; j++) {
            System.out.print(arr[0][j] * 3 + " ");//выводим эл-ты первой строки, умножив на 3
        }
    }
}
