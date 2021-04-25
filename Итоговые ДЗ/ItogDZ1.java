package com.max.idea;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ItogDZ1 {
    /*
    Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
    Пользователь вводит текущий курс и количество рублей.
    Итоговое значение должно быть округлено до двух знаков после запятой.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите курс доллара к рублю (например, 74,51): ");
        try {//добавим обработку исключений на случай, если пользователь введёт курс не в формате примера
            double course = sc.nextDouble();
            try {//добавим обработку исключений на случай, если пользователь введёт сумму не в формате примера
                System.out.println("Введите сумму рублей для перевода (например, 100,50)");
                double amount = sc.nextDouble();
                DecimalFormat f = new DecimalFormat("##0.00");//создаём класс для форматирования ответа по маске
                System.out.println("Итого " + f.format(amount/course) + " долл.");
            }
            catch (InputMismatchException iEx) {
                System.out.println("Неверный формат ввода!");
            }
        }
        catch (InputMismatchException iEx){
            System.out.println("Неверный формат ввода!");

        }

    }
}
