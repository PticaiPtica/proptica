import java.util.Arrays;

import static HomeWork.Methods.*;

public class Main {
    public static void main(String[] Args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    static void task1() {
        int first = 22;
        System.out.println(square(first));
        int two = 33;
        System.out.println(square(two));
    }

    static void task2() {
        String name1 = "jon";
        String name2 = "Marry";

        String family1 = "Smith";
        String family2 = "Smith";

        System.out.println(printFullName(name1, family1));
        System.out.println(printFullName(name2, family2));
    }

    static void task3() {
        String[] strings = {"Jhrsras", "Ma", "Janes", "Daddy"};
        System.out.println(Arrays.toString(cornerValuesArray(strings)));
        String[] stringsNew = {"R", "jord", "Kay", "Li"};
        System.out.println(Arrays.toString(cornerValuesArray(stringsNew)));
        System.out.println(Arrays.toString(cornerValuesArray("firs", "two", "three", "four", "five",
                "six", "seven", "eight", "nine")));
    }

    static void task4() {
        int[] numbers = {12, 42, 55, 1};
        System.out.println(Arrays.toString(cornerValuesArray(numbers)));
        int[] numbersNew = {77, 22, 11, 44};
        System.out.println(Arrays.toString(cornerValuesArray(numbersNew)));
        System.out.println(Arrays.toString(cornerValuesArray(123, 3213, 213, 123, 52, 1, 999)));
    }

    static void task5() {
        char[] chars = {'s', 'F', 'a', 'h'};
        System.out.println(Arrays.toString(cornerValuesArray(chars)));
        char[] charsNew = {'r', 'w', 'g', 'S'};
        System.out.println(Arrays.toString(cornerValuesArray(charsNew)));
        System.out.println(Arrays.toString(cornerValuesArray('d', 'w', 'W', '!', '@')));
    }

}

