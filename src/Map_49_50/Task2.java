package Map_49_50;


import Map_49_50.Task4.ComparatorTree_One;

import java.util.*;


public class Task2 {
    public static void main(String[] args) {
        String java = "!!! Java is Fun and java IS powerful !!!";

        String javaTask = java.replaceAll("!", "").toLowerCase();

        List<String> linkedList = new LinkedList<>();

        String[] words = javaTask.split(" ");

        linkedList.addAll(Arrays.asList(words));

        Collections.sort(linkedList);

        System.out.println(linkedList);

        Map<String, Integer> map = new TreeMap<>();

        for (String word : linkedList) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);


    }
}
