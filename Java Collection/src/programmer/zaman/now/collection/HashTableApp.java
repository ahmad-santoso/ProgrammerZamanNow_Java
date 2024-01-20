package programmer.zaman.now.collection;

import java.util.HashMap;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Ahmad", "Ahmad");
        map.put("Santoso", "Santoso");
        map.put("Anto", "Anto");

        for (var key : map.keySet()) {
            System.out.println(key);
        }
    }
}
