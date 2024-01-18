package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Anto");

        Set<String> mutable = new HashSet<>();
        mutable.add("Ahmad");
        mutable.add("Santoso");
        Set<String> imutable = Collections.unmodifiableSet(mutable);

        Set<String> elements = Set.of("Ahmad", "Santoso", "Anto");

        // set.add("Anto");  error
        // elements.remove("Anto"); error
    }
}
