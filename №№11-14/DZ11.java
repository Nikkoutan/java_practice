package com.max.idea;

import java.util.Scanner;

public class DZ11 {
    /*Ввести первое  число с клавиатуры и записать его в строковую переменную.
    Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
    Сравнить 2 числа и вывести большее на экран .
    Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        String x = sc.next();//сохраняем в строковую переменную
        System.out.println("Введите второе число:");
        double y = sc.nextDouble();//сохраняем в double, чтобы не получить ошибки, если пользователь введёт дробное
        int yInt = (int) y;//преобразуем в целое с потерей дробной части

        //из условия задачи не очень понятно, что именно считать за первое число, которое надо сравнить со вторым.
        //я решила сравнивать изначальное значение, а не преобразованное в int, т.к. если произойдёт потеря дробной части, это будет уже новое число

        double xDoub = Double.parseDouble(x.replace(',' , '.'));//меняем разделитель перед тем, как парсить в число
        System.out.println(Math.max(xDoub, y));//опять же, не сказано, в каком формате выводить победителя. выбран double ради единообразия
        System.out.println(Math.min(xDoub, y));
    }
}
