package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ДЗ №6
        /*1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
        > Выберите что переводить: 1 - масса, 2 - расстояние
        2. Пользователю предлагается выбрать единицу измерения. Пример:
        > Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
        3. Пользователю предлагается ввести количество выбранных единиц:
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите, что переводить: 1 - масса, 2 - расстояние:");
        int val = sc.nextInt();//выбор физ. величины
        switch (val){
            case 1: {//конвертер масс
                double[] mT = {1, 0.453592, 0.0283495, 16.3804815};//таблица отношения доступных ед. изм. к килограмму
                System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция, 4 - пуд:");
                int meas = sc.nextInt();//выбор ед. изм.
                if (meas != 1 && meas != 2 && meas != 3 && meas != 4) {//если введено число не из указанных, выводим ошибку
                    System.out.println("Недопустимое значение.");
                    break;
                }
                System.out.println("Введите массу:");
                double len = sc.nextDouble();//ввод значения в выбранных ед. изм.
                System.out.println("Результат:");
                System.out.println("Килограммы: " + len*mT[meas - 1]/mT[0]);
                System.out.println("Фунты: " + len*mT[meas - 1]/mT[1]);
                System.out.println("Унции: " + len*mT[meas - 1]/mT[2]);
                System.out.println("Пуды: " + len*mT[meas - 1]/mT[3]);
                break;
            }
            case 2: {
                double[] lT = {1, 1609, 0.9144, 0.3048};//таблица отношения выбранных ед. изм. к метру
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут:");
                int meas = sc.nextInt();//выбор ед. изм.
                if (meas != 1 && meas != 2 && meas != 3 && meas != 4) {//если введено число не из указанных, выводим ошибку
                    System.out.println("Недопустимое значение.");
                    break;
                }
                System.out.println("Введите расстояние:");
                double len = sc.nextDouble();//ввод значения в выбранных ед. изм.
                System.out.println("Результат:");
                System.out.println("Метры: " + len*lT[meas - 1]/lT[0]);
                System.out.println("Мили: " + len*lT[meas - 1]/lT[1]);
                System.out.println("Ярды: " + len*lT[meas - 1]/lT[2]);
                System.out.println("Футы: " + len*lT[meas - 1]/lT[3]);
                break;
            }
            default:
                System.out.println("Недопустимое значение.");//если введено число не из указанных, выводим ошибку
        }

    }
}
