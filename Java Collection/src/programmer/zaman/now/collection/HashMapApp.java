package programmer.zaman.now.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Name.First", "Ahmad");
        map.put("Name.Middle", "Santoso");
        map.put("Name.Last", "Anto");

        System.out.println(map.get("Name.First"));
        System.out.println(map.get("Name.Middle"));
        System.out.println(map.get("Name.Last"));
    }
}
