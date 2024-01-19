package programmer.zaman.now.collection;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "Name.First";

        String name = "Name";
        String dot = ".";
        String first = "First";

        String key2 = name + dot + first;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        map.put(key1, "Ahmad");
        map.put(key2, "Ahmad");

        System.out.println(map.size());
    }
}
