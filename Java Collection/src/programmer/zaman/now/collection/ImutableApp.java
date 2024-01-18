package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImutableApp {
    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Ahmad");
        mutable.add("Santoso");
        List<String> imutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Ahmad", "Santoso", "Anto");
    }
}
