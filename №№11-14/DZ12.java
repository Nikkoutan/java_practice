package com.max.idea;

import java.util.Scanner;

public class DZ12 {
    public static void main(String[] args) {
        System.out.println("Введите 'I like Java!!!'");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        //проверяем подстроку
        if (a.contains("Java")){
            System.out.println("Строка содержит слово 'Java'!");
        }
        else {
            System.out.println("Строка НЕ содержит слово 'Java'!");
                    }

        //проверяем начало
        if (a.startsWith("I like")){
            System.out.println("Строка начинается с 'I like'!");
        }
        else {
            System.out.println("Строка НЕ начинается с 'I like'!");
                    }

        //проверяем конец
        if (a.endsWith("!!!")){
            System.out.println("Строка заканчивается на '!!!'!");
        }
        else {
            System.out.println("Строка НЕ заканчивается на '!!!'!");
                    }

        //выводим а в верхнем регистре, если все три условия выше верны
        if (a.contains("Java")&&a.startsWith("I like")&&a.endsWith("!!!")) {
            System.out.println(a.toUpperCase());
        }

        //заменяем символы, выводим подстроку
        System.out.println(a.replace('a', 'o').substring(7, 11));
    }
}
