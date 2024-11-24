package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
    public static void main(String[] args) {


        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Jane");
        names.add("Jack");
        names.add("Bob");
        System.out.println(names);

        names.size();
        System.out.println(names.size());

        names.remove("John");
        System.out.println(names);

        names.contains("Jane");
        System.out.println(names.contains("Jack"));



        System.out.println(names.stream());

    }
}
