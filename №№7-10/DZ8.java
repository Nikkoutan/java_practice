package com.max.idea;

import java.util.Scanner;

public class DZ8 {
    /*пользователь вводит любое целое положительное число n.
    программа суммирует все нечетные числа от 1 до введенного пользователем числа n.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int n = sc.nextInt();
        int sum = 0;//переменная для суммы
        for (int i = 1; i <= n; i++) {
            if ((i % 2) != 0) {
                sum += i;
            }
        }
        //вывод результата в задании не требуется
    }

}
