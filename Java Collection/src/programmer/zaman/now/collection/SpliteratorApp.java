package programmer.zaman.now.collection;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;

public class SpliteratorApp {
    public static void main(String[] args) {
        List<String> list = List.of("Ahmad", "Santoso", "Masant", "Programmer", "Zaman", "Now");

        Spliterator<String> spliterators1 = list.spliterator();
        Spliterator<String> spliterators2 = spliterators1.trySplit();

        System.out.println(spliterators1.estimateSize());
        System.out.println(spliterators2.estimateSize());

        spliterators1.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        spliterators2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
