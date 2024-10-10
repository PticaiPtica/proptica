import java.util.Arrays;

import static HomeWork.Methods.*;

public class Main {
    public static void main(String[] Args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    static void task1() {
        System.out.println("task1");
        int first = 22;
        System.out.println(square(first));
        int two = 33;
        System.out.println(square(two));

    }

    static void task2() {
        System.out.println("task2");
        String name1 = "jon";
        String name2 = "Marry";

        String family1 = "Smith";
        String family2 = "Smith";

        System.out.println(printFullName(name1, family1));
        System.out.println(printFullName(name2, family2));
    }

    static void task3() {
        System.out.println("task3");
        String[] strings = {"Jhrsras", null, "Janes", "Daddy"};
        String[] strings1 = {null, null, "Jaes", "Daddy", "wArry"};
        String[] stringsNew = {"Rs", "jord", "Kay", "L"};
        String[] stringsNull = new String[3];
        String[] stringsNullLeight = new String[]{};
        System.out.println("strings -" + Arrays.toString(cornerValuesArray(strings)));
        System.out.println("strings1 -" + Arrays.toString(cornerValuesArray(strings1)));
        System.out.println("stringsNew -" + Arrays.toString(cornerValuesArray(stringsNew)));
        System.out.println("stringsNull -" + Arrays.toString(cornerValuesArray(stringsNull)));
        System.out.println("stringsNullLeight -" + Arrays.toString(cornerValuesArray(stringsNullLeight)));
        System.out.println("strings -" + Arrays.toString(cornerValuesArray("firs", "two", null, "four", "five",
                "six", "seven", "eight", null)));
    }

    static void task4() {
        System.out.println("task4");
        int[] numbers = {-12, 99, 55, -10};
        int[] numberNull = new int[4];
        int[] numbersNullLeight = new int[]{};
        int[] numbersNew = {-77, -22, -11, -44};
        System.out.println("numbers -" + Arrays.toString(cornerValuesArray(numbers)));
        System.out.println("numberNull -" + Arrays.toString(cornerValuesArray(numberNull)));
        System.out.println("numbersNew -" + Arrays.toString(cornerValuesArray(numbersNew)));
        System.out.println("numbersNullLeight -" + Arrays.toString(cornerValuesArray(numbersNullLeight)));
        System.out.println("numbers -" + Arrays.toString(cornerValuesArray(-4123, 3213, 213, 123, 52, 11, 999)));
        System.out.println("numbers -" + Arrays.toString(cornerValuesArray(0, 0, 0, 0, 0, 0, 0)));
    }

    static void task5() {
        System.out.println("task5");
        char[] chars = {'s', 'F', 'a', 'h'};
        char[] charsNew = {'s', ' ', 'w', ' '};
        char[] charsN = {' ', ' ', ' ', ' '};
        char[] charsNull = new char[3];
        char[] charsNullLeight = new char[]{};
        System.out.println("chars -" + Arrays.toString(cornerValuesArray(chars)));
        System.out.println("charsNew -" + Arrays.toString(cornerValuesArray(charsNew)));
        System.out.println("charsN -" + Arrays.toString(cornerValuesArray(charsN)));
        System.out.println("charsNull -" + Arrays.toString(cornerValuesArray(charsNull)));
        System.out.println("charsNullLeight -" + Arrays.toString(cornerValuesArray(charsNullLeight)));
        System.out.println("chars -" + Arrays.toString(cornerValuesArray('d', 'w', 'W', '!', '0')));
    }

    static void task6() {
        System.out.println("task6");
        System.out.println("факториал - " + facktorial(6));
    }

}

