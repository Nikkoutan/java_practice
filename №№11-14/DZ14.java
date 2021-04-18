package com.max.idea;

import java.util.Random;

public class DZ14 {
    /*
    Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
    Выведите максимальный и минимальный элемент массива.
    Из максимального и минимального значения выведите наибольшее по модулю.
     */
    public static void main(String[] args) {
        double[] arr = new double[15];//задаём массив
        Random random = new Random();
        for (int i = 0; i<15; i++){
            arr[i] = random.nextDouble()*40-20;//подгоняем диапазон к от -20 до 20
        }

        //определяем и выводим максимум
        double arrMax = Double.MIN_VALUE;
        for (double el: arr){
            if (el > arrMax){
                arrMax = el;
            }
        }
        System.out.println("Максимальный элемент массива: " + arrMax);

        //определяем и выводим минимум
        double arrMin = Double.MAX_VALUE;
        for (double el: arr){
            if (el < arrMin){
                arrMin = el;
            }
        }
        System.out.println("Минимальный элемент массива: " + arrMin);

        //определяем наибольшее по модулю и выводим число, сохраняя знак
        if (Math.abs(arrMax) > Math.abs(arrMin)){
            System.out.println("Наибольшее по модулю: " + arrMax);
        }
        else if (Math.abs(arrMax) < Math.abs(arrMin)){
            System.out.println("Наибольшее по модулю число: " + arrMin);
        }
        else System.out.println("Макс. и мин. значения равны по модулю");

    }
}
