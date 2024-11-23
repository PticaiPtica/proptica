package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsImpl {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); //самая быстрая, но не сохраняет порядок
        //Map<String, Integer> map = new LinkedHashMap<>(); //Сохраняет порядок вставки, время константное, но доп.расходы есть
        //Map<String, Integer> map = new TreeMap<>(); //сортирует элементы, время логарифмическое

        map.put("banana", 15);
        map.put("apple", 20);
        map.put("orange", 15);
        map.put("pineapple", 20);
        System.out.println(map);
        System.out.println(map.get("banana"));
        System.out.println(map.hashCode());

        map.putIfAbsent("apple", 20);
        map.put("apple", 10);

        System.out.println(map);

        System.out.println(map);

        System.out.println(map.get("banana"));
        System.out.println(map.get("apple"));
        System.out.println(map.getOrDefault("apple", 0));

        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            value++;
            System.out.println(value);
        }
        for(Integer value : map.values()) {
            value++;
            System.out.println(value);
        }
    }
}
