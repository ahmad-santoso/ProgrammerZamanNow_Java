package programmer.zaman.now.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        // Set<String> names = new HashSet<>();     // tidak bisa duplikat datanya dan data tidak berurut
        Set<String> names = new LinkedHashSet<>();   // data urut

        names.add("Ahmad");
        names.add("Santoso");
        names.add("Anto");
        names.add("Ahmad");
        names.add("Santoso");
        names.add("Anto");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
