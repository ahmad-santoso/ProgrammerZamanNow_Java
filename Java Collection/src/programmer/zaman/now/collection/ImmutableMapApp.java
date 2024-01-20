package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("Name", "Ahmad");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("Name", "Ahmad");
        Map<String, String> imutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "First", "Ahmad",
                "Middle", "Santoso",
                "Last", "Anto"
        );

        // map.put("a", "A"); error
    }
}
