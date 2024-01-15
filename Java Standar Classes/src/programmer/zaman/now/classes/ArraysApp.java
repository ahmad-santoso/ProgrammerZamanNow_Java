package programmer.zaman.now.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {
             1,5,9,23,57,8,29,34,54,45,78,21,94
        };

        Arrays.sort(numbers);               // sort untuk mengurutkan
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers,21));        // binary search untuk mencari indeks
        System.out.println(Arrays.binarySearch(numbers,57));
        System.out.println(Arrays.binarySearch(numbers,100));       // hasil akan negatif karena tidak ada

        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(result2));
    }
}
