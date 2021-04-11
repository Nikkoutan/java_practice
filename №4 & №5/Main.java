package com.max.idea;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ДЗ №4
        /*1. Ввести три числа с клавиатуры x, y, z
        2. Найти и вывести в консоль среднее арифметическое этих чисел.
        3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
         */

        double x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число и нажмите Enter:");
        x = sc.nextDouble();
        System.out.print("Введите число и нажмите Enter:");
        y = sc.nextDouble();
        System.out.print("Введите число и нажмите Enter:");
        z = sc.nextDouble();

        double av = (x+y+z)/3;
        System.out.println(av);

        //наверняка есть готовый способ округлить результат деления вниз, но для разнообразия так:
        if ((av - av%2)/2 > 3) {
            System.out.println("Программа выполнена корректно");
        }

        //ДЗ №5
        /*Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
        В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
        */
        double x1, x2;
        String sym;
        System.out.print("Введите число и нажмите Enter:");
        x1 = sc.nextDouble();
        System.out.print("Введите число и нажмите Enter:");
        x2 = sc.nextDouble();
        System.out.print("Введите символ арифметической операции: +, -, * или /, и нажмите Enter:");
        sym = sc.next();

        switch (sym) {
            case "+":
                System.out.println(x1 + x2);
                break;
            case "-":
                System.out.println(x1 - x2);
                break;
            case "*":
                System.out.println(x1 * x2);
                break;
            case "/":
                System.out.println(x1 / x2);
        }

    }
}
