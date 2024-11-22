package Map_49_50;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String java = "java is fun and java is powerful";
        String javaTest = "JJJ";
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> mapTest = new HashMap<>();

        for (int i = 0; i < java.length(); i++) {
            char char1 = java.charAt(i);
            if (char1 != ' ') {
                map.put(char1, map.getOrDefault(char1, 0) + 1);
            }
        }
        for (int i = 0; i < javaTest.length(); i++) {
            char char1 = javaTest.charAt(i);
            if (char1 != ' ') {
                mapTest.put(char1, mapTest.getOrDefault(char1, 0) + 1);
            }
        }

        System.out.println(map);
        System.out.println(uniqueness(map));
        System.out.println(averageCount(map));

        System.out.println(mapTest);
        System.out.println(uniqueness(mapTest));
        System.out.println(averageCount(mapTest));

    }

    public static boolean uniqueness(Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return true;
            }
        }

        return false;
    }

    public static double averageCount(Map<Character, Integer> map) {
        int sum = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                sum += entry.getValue();
            }

        }
        return (double) sum / (map.size());
    }
}