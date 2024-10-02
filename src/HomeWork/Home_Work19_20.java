package HomeWork;

import java.util.Arrays;

public class Home_Work19_20 {
    public static void main(String[] Args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    static void task1() {
        int[] array1 = {10, 20, 30, 40, 50};
        int sumMassiv = 0;
        for (int ma : array1) {
            sumMassiv = sumMassiv + ma;
        }
        int srMassiv = sumMassiv / array1.length;
        System.out.println(srMassiv);
    }

    static void task2() {
        double[] array2 = {3.5, 7.8, -1.4, 9.2, -3.2};
        double min = array2[0];
        double max = array2[0];
        for (int i = 0; i < array2.length - 1; i++) {
            double g = array2[i + 1];
            if (min < g) {
            } else if (min > g) {
                min = array2[i + 1];
            }
        }
        for (int i = 0; i < array2.length - 1; i++) {
            double g = array2[i + 1];
            if (max < g) {
                max = array2[i + 1];
            } else if (min > g) {
                continue;
            }
        }
        System.out.println("Макс ");
        System.out.println("Мин ");
    }

    static void task3() {
        char[] gl = {'a', 'e', 'i', 'o', 'u'};
        char[] chars = {'a', 'B', 'i', 't', 'E', 'r'};
        int sumS = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            for (int i2 = 0; i2 < gl.length - 1; i2++) {
                String in = String.valueOf(chars[i]);
                String out = String.valueOf(gl[i2]);
                if (in.equalsIgnoreCase(out)) {
                    sumS += 1;
                }
            }
        }
        System.out.println("маленьких " + sumS);
    }

    static void task4() {
        String str = "Hello World this is Java";
        char[] charArray = str.toCharArray();
        char space = ' ';
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == space) {
                charArray[i] = '_';
            }
        }
        System.out.println(charArray);
    }

    static void task5() {
        String str = "apple,banana,grape,orange";
        String[] result = new String[]{"", "", "", "",};
        char[] charArray = str.toCharArray();
        char red = ',';
        int indexResult = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == red) {
                indexResult += 1;
            } else {
                result[indexResult] += charArray[i];
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
