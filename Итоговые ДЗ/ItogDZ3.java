package com.max.idea;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ItogDZ3 {
    /*
    Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
    Среди данных строк найти строку с максимальным количеством различных символов.
    Если таких строк будет много, то вывести первую.
     */
    public static void main(String[] args) {
        System.out.println("Введите число строк:");
        Scanner sc = new Scanner(System.in);
        try {
            int strNum = sc.nextInt();//запоминаем число строк
            String[] txt = new String[strNum];//массив для записи введённых строк
            int[] symNum = new int[strNum];//массив для записи количества уникальных символов в каждой строке
            for (int i = 0; i < strNum; i++) {//получаем и обрабатываем все строки
                System.out.println("Введите " + (i + 1) + "-ю строку:");
                txt[i] = sc.next();//пользователь вводит строку
                char[] chArr = txt[i].toCharArray();//раскладываем её в массив символов
                int counter = 0;//счётчик количества уникальных символов
                for (int j = 0; j < txt[i].length() - 1; j++) {//перебираем символы в строке
                    int count2 = 0;//счётчик, который изменяет значение, если символ в строке повторяется
                    for (int k = j + 1; k < txt[i].length(); k++) {//перебираем символы, следующие за данным
                        if (chArr[j] == chArr[k]) {//если там есть совпадения
                            count2 = 1;//то счётчик переключается - этот символ не вносит вклад в сумму уникальных
                            break;
                        }
                    }
                    if (count2 == 0)
                        counter++;//если совпадений не найдено, увеличиваем счётчик и переходим к следующему символу

                }
                symNum[i] = counter + 1;//записываем количество уникальных символов в массив уникальных символов на позицию, соответствующую строке в массиве строк
            }
            //ищём максимум в массиве symNum, сохраняем номер максимального элемента (первого из, если их несколько)
            int max = Integer.MIN_VALUE;
            int a = 0;
            for (int i = 0; i < strNum; i++) {
                if (symNum[i] > max) {
                    max = symNum[i];
                    a = i;
                }

            }
            System.out.println("Ответ: " + txt[a]);
        } catch (InputMismatchException iEx) {//если пользователь ввёл число строк некорректно, выводим ошибку
            System.out.println("Неверный формат ввода!");

        }
    }
}
