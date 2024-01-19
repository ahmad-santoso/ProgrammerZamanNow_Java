package programmer.zaman.now.collection;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapApp {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new WeakHashMap<>();        // hasilnya 540879

        for (int i = 0; i < 1_000_000; i++) {
            map.put(i, 1);
        }

        System.gc();

        System.out.println(map.size());
    }
}
