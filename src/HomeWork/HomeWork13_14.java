package HomeWork;

import java.util.Scanner;

public class HomeWork13_14 {
    public static void main(String[] ignoredArgs) {
        task1();
        task2();
        task3();
    }

    static void task1() {
        /*Задача 1. Вывод чётных чисел от 1 до n
        Условие: Напишите программу, которая выводит все НЕчётные числа от 1 до заданного числа n.
        Пример: Для n = 10 программа должна вывести: 1 3 5 7 9
*/
        int n = 10;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                continue;
            }
            if (i % 2 != 0) {
                System.out.print(" " + i);
            }
        }
        System.out.println("   ");
    }

    static void task2() {
        /*Задача 2. Произведение чисел от 1 до n
        Условие: Напишите программу, которая вычисляет произведение всех чисел от 1 до заданного числа n
        Пример: Для n = 4, результат будет 1 * 2 * 3 * 4 = 24.*/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i2 = 1;
        for (int i = 1; i <= n; i++) {
            i2 = i2 * i;
        }
        System.out.println(i2);
        System.out.println("   ");
    }

    static void task3() {
        /*Задача 3. Таблица умножения
        Условие: Напишите программу, которая выводит таблицу умножения от 1 до 10 (1 * 1, 1* 2 и т.д. до 10 * 10)
        Использовать вложенные циклы for.
*/
        int j2 = 0;
        for (int i = 1, j = 1; j <= 10; i++) {
            if (i == 11) {
                j = j + 1;
                i = 1;
                System.out.println(" ");
            }
            j2 = i * j;
            System.out.print(i + "*" + j + "=" + j2 + " ");
        }


    }
}


