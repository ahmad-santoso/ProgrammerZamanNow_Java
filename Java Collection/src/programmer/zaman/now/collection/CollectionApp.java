package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("Ahmad");
        collection.add("Santoso");
        collection.add("Anto");
        collection.addAll(List.of("Programmer", "Zaman", "Now"));

        for (var values : collection) {
            System.out.println(values);
        }

        System.out.println("===Remove===");
        collection.remove("Ahmad");
        collection.remove("Masant");    // tidak ada efek, karena tidak ada datanya
        collection.removeAll(List.of("Zaman", "Now"));

        for (var values : collection) {
            System.out.println(values);
        }

        System.out.println(
                collection.contains("Santoso")
        );

        System.out.println(
                collection.containsAll(List.of("Anto", "Programmer"))
        );

        System.out.println(collection.size());
    }
}
