package programmer.zaman.now.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Ahmad");
        stack.offerLast("Santoso");
        stack.offerLast("Anto");

        System.out.println(stack.pollLast());   // untuk offerLast
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        //  for (var value : deque) {           // untuk offerFirst
        //      System.out.println(value);
        //  }

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Ahmad");
        queue.offerLast("Santoso");
        queue.offerLast("Anto");

        System.out.println(queue.pollFirst());   // untuk queue diatas / antrian
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
}
