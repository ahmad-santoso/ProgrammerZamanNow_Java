package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        // List<String> strings = new LinkedList<>();

        strings.add("Ahmad");
        strings.add("Santoso");
        strings.add("Anto");

        strings.set(0, "Masant");

        strings.remove(2);

        System.out.println(strings.get(0));

        for (var value : strings) {
            System.out.println(value);
        }
    }
}
