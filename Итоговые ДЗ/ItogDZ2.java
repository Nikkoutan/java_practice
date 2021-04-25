package com.max.idea;

import java.util.Scanner;

public class ItogDZ2 {
    /*
    Напишите программу, которая позволит решить простое уравнение относительно x.
    Программа принимает на вход строку длиной 5 символов.
    Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
    Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
    Нужно найти неизвестное.
     */
    public static void main(String[] args) {
        System.out.println("Введите уравнение в формате 2+х=9");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().replace(" ", "");//удаляем пробелы для удобства пользователя
        char[] arr = str.toCharArray();//раскладываем строку в массив символов
        if (str.matches("[xх][+-][0-9][=][0-9]")){//сравниваем строку с регулярным выражением, где х на первом месте
            switch (arr[1]){
                case '+': {//если в левой части сложение
                    System.out.println("x=" + (Character.getNumericValue(arr[4]) - Character.getNumericValue(arr[2])));
                    break;
                }
                case '-': {//если в левой части вычитание
                    System.out.println("x=" + (Character.getNumericValue(arr[2]) + Character.getNumericValue(arr[4])));
                    break;
                }
            }
        }
        else if (str.matches("[0-9][+-][xх][=][0-9]")){//сравниваем строку с регулярным выражением, где х на втором месте
            switch (arr[1]){
                case '+': {//если в левой части сложение
                    System.out.println("x=" + (Character.getNumericValue(arr[4]) - Character.getNumericValue(arr[0])));
                    break;
                }
                case '-': {//если в левой части вычитание
                    System.out.println("x=" + (Character.getNumericValue(arr[0]) - Character.getNumericValue(arr[4])));

                    break;
                }
            }
        }
        else if (str.matches("[0-9][+-][0-9][=][xх]")){//сравниваем строку с регулярным выражением, где х на последнем месте
            switch (arr[1]){
                case '+': {//если в левой части сложение
                    System.out.println("x=" + (Character.getNumericValue(arr[2]) + Character.getNumericValue(arr[0])));
                    break;
                }
                case '-': {//если в левой части вычитание
                    System.out.println("x=" + (Character.getNumericValue(arr[0]) - Character.getNumericValue(arr[2])));
                    break;
                }
            }
        }
        else System.out.println("Неверный формат уравнения!");//если строка не соответствует ни одному из трёх вариантов выше, выводим ошибку формата ввода


    }
}
