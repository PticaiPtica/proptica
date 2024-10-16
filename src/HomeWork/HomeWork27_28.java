package HomeWork;

import java.util.Arrays;

public class HomeWork27_28 {
    public static void main(String[] Args) {

        int[][] massiv = new int[3][3];
        System.out.println("1.Заполняет массив целыми числами от 1 до 9.");
        fillMassiv(massiv);
        System.out.println("2.Выводит массив в виде матрицы на экран.");
        printMassiv(massiv);
        System.out.println("3.Находит сумму элементов в каждой строке и выводит её.");
        sumLineMassiv(massiv);
        System.out.println("4.Находит сумму элементов в каждом столбце и выводит её.");
        sumMassivColumn(massiv);

        System.out.println();

        int[] nums2 = new int[]{4, 2, 42, 5, 4, 3, 1, 7};
        System.out.println("Исходный массив" + Arrays.toString(nums2));
        changeCopyArray(nums2);
        System.out.println("Текущий массив после изменения копии" + Arrays.toString(nums2));
        changeArray(nums2);
        System.out.println("После изменения массив" + Arrays.toString(nums2));


    }


    static void fillMassiv(int[][] massiv) {
        int count = 0;
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                massiv[i][j] = ++count;
            }
        }

    }

    static void printMassiv(int[][] massiv) {
        for (int[] i : massiv) {
            for (int j = 0; j < massiv[0].length; j++) {
                System.out.print(" " + i[j] + " ");
            }
            System.out.println();
        }

    }

    static void sumLineMassiv(int[][] massiv) {
        int sumMassivLine;
        int line = 1;
        for (int[] i : massiv) {
            sumMassivLine = 0;
            for (int j = 0; j < i.length; j++) {
                sumMassivLine += i[j];
                if (j == i.length - 1) {
                    System.out.println("сумма строки " + line + ": " + sumMassivLine);
                    line++;
                }
            }
        }

    }

    static void sumMassivColumn(int[][] massiv) {
        int sumMassivColumn;
        int column = 1;
        for (int i = 0; i < massiv.length; i++) {
            sumMassivColumn = 0;
            for (int j = 0; j < massiv[i].length; j++) {
                sumMassivColumn += massiv[j][i];
                if (j == massiv.length - 1) {

                    System.out.println("сумма столбца " + column + ": " + sumMassivColumn);
                    column++;
                }
            }
        }

    }

    static void changeArray(int[] nums2) {
        java.util.Arrays.sort(nums2);
    }

    static void changeCopyArray(int[] nums2) {
        int[] numsCopy = java.util.Arrays.copyOf(nums2, nums2.length);
        java.util.Arrays.fill(numsCopy, 0);
        System.out.println("Работа с копией массива" + Arrays.toString(numsCopy));
    }
}