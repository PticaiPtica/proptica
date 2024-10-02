import java.util.Arrays;

import static HomeWork.Methods.*;

public class Main {
    public static void main(String[] Args) {
        tast1();
        tast2();
        tast3();

    }

    static void tast1() {
        int first = 22;
        System.out.println(square(first));
        int two = 33;
        System.out.println(square(two));
    }

    static void tast2() {
        String name1 = "jon";
        String name2 = "Marry";
        String family1 = "Smith";
        String family2 = "Smith";

        System.out.println(printFullName(name1, family1));
        System.out.println(printFullName(name2, family2));

    }

    static void tast3() {
        String[] strings = {"Johnss", "Ma", "Janes", "Daddy"};
        System.out.println(Arrays.toString(cornerValuesArray(strings)));
        String[] stringsNew = {"Ramy", "jord", "Kay", "Li"};
        System.out.println(Arrays.toString(cornerValuesArray(stringsNew)));
    }

}

