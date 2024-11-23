package Collections;

import java.util.*;

public class ListCollecions {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        String[] names2 = {"Ark", "Bib", "Crat"};
        List<String> names3 = Arrays.asList(names2);
        List<String> namesTemp = new ArrayList<>(names3);
        namesTemp.add("Arkw");
        System.out.println(namesTemp);
        names.add("Jord");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");

        System.out.println(names);
        names.add("Jord");

        names.remove("Jord");
        names.remove("Jord");

        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);

        Collections.reverse(names);
        System.out.println(names);

        Collections.shuffle(names);
        System.out.println(names);

        List<Integer> integers = new ArrayList<>(Collections.nCopies(10, 0));
        Collections.addAll(integers, 0);
        System.out.println(integers);


        LinkedList<Integer> linkedList = new LinkedList<>(Collections.nCopies(10, 0));
        System.out.println(linkedList);
    }

}
