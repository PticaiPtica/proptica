package ClassWork;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String word = "Какое то слово больше еще";
        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < word.length(); i++) {

            char char1 = word.charAt(i);
            map.put(char1, map.getOrDefault(char1, 0) + 1);


            //map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);

        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

    }
}
