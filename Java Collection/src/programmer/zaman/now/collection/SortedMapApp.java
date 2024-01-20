package programmer.zaman.now.collection;

import java.util.*;

public class SortedMapApp {
    public static void main(String[] args) {

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);

        sortedMap.put("Masant", "Masant");
        sortedMap.put("Cilo", "Cilo");
        sortedMap.put("Ahmad", "Ahmad");

        for (var key : sortedMap.keySet()) {
            System.out.println(key);
        }

        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> imutable = Collections.unmodifiableSortedMap(sortedMap);

        // imutable.put("Anto", "Anto"); error
    }
}
