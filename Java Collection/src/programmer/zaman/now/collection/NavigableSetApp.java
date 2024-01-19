package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Ahmad", "Santoso", "Anto", "Masant", "Tray"));

        NavigableSet<String> nameReverse = names.descendingSet();
        NavigableSet<String> santoso = names.tailSet("Santoso", true);

        for (var name : santoso) {
            System.out.println(name);
        }

        NavigableSet<String> imutable = Collections.unmodifiableNavigableSet(names);
        // imutable.add("Ups"); error
    }
}
