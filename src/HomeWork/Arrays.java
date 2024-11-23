package HomeWork;

public class Arrays {
    public static void main(String[] Args) {
        int[][] massive = new int[3][4];
        int count = 0;
        int sumMassivLine;
        int sumMassivColumn;
        int column = 1;
        int line = 1;
        //1.	Заполняет массив целыми числами от 1 до 9.
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[0].length; j++) {
                massive[i][j] = ++count;
            }
        }
        //2.	Выводит массив в виде матрицы на экран.
        for (int[] ints : massive) {
            for (int j = 0; j < massive[0].length; j++) {
                System.out.print(" " + ints[j] + " ");
            }
            System.out.println();
        }
        //3.	Находит сумму элементов в каждой строке и выводит её.
        for (int[] ints : massive) {
            sumMassivLine = 0;
            for (int j = 0; j < ints.length; j++) {
                sumMassivLine += ints[j];
                if (j == ints.length - 1) {
                    System.out.println("сумма строки " + line + ": " + sumMassivLine);
                    line++;
                }
            }
        }
        //4.	Находит сумму элементов в каждом столбце и выводит её.
        for (int i = 0; i < massive[0].length; i++) {
            sumMassivColumn = 0;
            for (int j = 0; j < massive.length; j++) {
                sumMassivColumn += massive[j][i];
                if (j == massive[j].length) {
                    System.out.println("сумма столбца " + column + ": " + sumMassivColumn);
                    column++;
                }
            }
        }
    }
}
