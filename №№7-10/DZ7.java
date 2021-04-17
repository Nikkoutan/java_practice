package com.max.idea;

import java.util.Scanner;

public class DZ7 {
    /*Пользователь вводит размер массива и данные с клавиатуры в массив
    Сравнить элементы массива с заранее заданными константами x, y, z.
    Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
*/
    public static void main(String[] args) {
        int x = 5;
        int y = -1;
        int z = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];//задаём массив указанной длины
        System.out.println("Введите целые числа (" + arrLen + " шт.): ");
        for (int i = 0; i < arrLen; i++){
            arr[i] = sc.nextInt();//ввод данных с клавиатуры и сохранение в массив
        }
        for (int val: arr){//перебор элементов массива для сравнения с константами
            if (val == x || val == y || val == z){
                System.out.println("Данное значение имеется в константах");
                break;//как только нашли первое совпадение, останавливаем перебор, т.к. текст нужно вывести один раз
            }
        }
    }

}
