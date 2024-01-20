package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Ahmad", "Ahmad");
        map.put("Santoso", "Santoso");
        map.put("Anto", "Anto");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Anto"));
        System.out.println(map.higherKey("Anto"));
        System.out.println(map.floorKey("Anto"));
        System.out.println(map.ceilingKey("Anto"));

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet()) {
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> imutable = Collections.unmodifiableNavigableMap(mapDesc);

        // imutable.put("Anto", "Anto"); error
    }
}
