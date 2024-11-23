package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jord");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");

        System.out.println(names);
        names.add("Jord");

        names.remove("Jord");
        names.remove("Jord");

        System.out.println(names);

        List<String> newNames = new ArrayList<>();
        newNames.add("Jord");
        newNames.add("Jane");
        newNames.add("Bobs");

        names.addAll(newNames);
        System.out.println(names);

        System.out.println(STR."есть ли Jord \{names.contains("Jord")}");
        System.out.println(STR."есть ли Sergey \{names.contains("Sergey")}");

        System.out.println(names.size());
        System.out.println(names);
        names.remove(0);
        names.remove("Sergey");
        System.out.println(names);

        boolean resultSergey = names.remove("Sergey");
        System.out.println(resultSergey);

        boolean resultJord = names.remove("Jord");
        System.out.println(resultJord);

        System.out.println(names);

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String name : names) {
            System.out.println(name);
        }
    }

}
