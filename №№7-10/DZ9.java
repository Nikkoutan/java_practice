package com.max.idea;

import java.util.Scanner;

public class DZ9 {
    /*Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
    Посчитайте среднее арифметическое элементов массива.
    После этого произведите вывод массива на экран, где каждый элемент массива умножается
    на среднее арифметическое*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arrLen = sc.nextInt();
        double[] arr = new double[arrLen];//задаём массив указанной длины
        System.out.println("Введите числа типа double (" + arrLen + " шт.): ");
        for (int i = 0; i < arrLen; i++){
            arr[i] = sc.nextDouble();//ввод данных с клавиатуры и сохранение в массив
        }
        double sum, avg;//переменные для суммы и ср. знач.
        sum = 0;
        for (double val: arr){//суммируем все значения
            sum += val;
            }
        avg = sum / arrLen;//ср. знач. = сумма, делённая на количество
        for (double val: arr){
            System.out.print(val * avg +" ");//выводим все эл-ты массива, умножив на ср. знач.
        }
    }

}
