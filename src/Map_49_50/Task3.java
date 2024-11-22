package Map_49_50;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) {
        Map<Integer, Character> mapTest = new HashMap<>();
        mapTest.put(1, 'C');
        mapTest.put(2, 'B');
        mapTest.put(3, 'A');

        System.out.println(reverse(mapTest));
    }

    public static Map<Character, Integer> reverse(Map<Integer, Character> mapTest) {
        Map<Character, Integer> mapReverse = new LinkedHashMap<>();
        for (Map.Entry<Integer, Character> entry : mapTest.entrySet()) {
            mapReverse.put(entry.getValue(), entry.getKey());


        }
        return mapReverse;
    }
}
