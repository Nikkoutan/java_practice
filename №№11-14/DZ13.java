package com.max.idea;

import java.util.Scanner;

public class DZ13 {
    /*
    пользователь должен ввести строку из слов, разделенных пробелами
    Выведите слова, состоящие только из латиницы.
    Выведите количество этих слов.
     */
    public static void main(String[] args) {
        System.out.println("Введите несколько слов через пробел:");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();//сохраняем строку как String
        String[] arr = a.split(" ");//преобразуем строку в массив строк
        int count = 0;//счётчик слов на латинице
        System.out.println("Слова, состоящие только из латиницы:");
        for (String word: arr) {
            if (word.matches("[A-Za-z]+")){//сравниваем с регулярным выражением: сколько угодно любых латинских букв и только их
                System.out.println(word);
                count++;
            }
        }
        System.out.println("Итого слов: "+ count + ".");
    }
}
