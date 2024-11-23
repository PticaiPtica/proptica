package Collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("wrapper", "обертка");
        map.put("array", "массив");
        map.put("link", "ссылка");
        map.put("list", "список");


        System.out.println(map);
        System.out.println(map.get("wrapper"));

        Map<Integer, String> map2 = new HashMap<>();

        map2.put(1, "one");
        map2.put(3, "tree");
        map2.put(2, "two");
        map2.put(4, "four");
        map2.put(5, "five");
        map2.put(6, "six");
        map2.put(7, "seven");
        map2.put(8, "eight");
        map2.put(9, "nine");
        map2.put(10, "ten");
        map2.put(11, "eleven");
        map2.put(12, "twelve");
        map2.put(13, "thirteen");
        map2.put(14, "fourteen");
        map2.put(15, "fifteen");
        map2.put(16, "sixteen");
        map2.put(17, "seventeen");
        map2.put(18, "eighteen");
        map2.put(19, "nineteen");
        map2.put(20, "twenty");



        System.out.println(map2);





    }
}
