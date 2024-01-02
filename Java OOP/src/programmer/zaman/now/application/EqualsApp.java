package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Ahmad";
        first = first + " " + "Santoso";
        System.out.println(first);

        String second = "Ahmad Santoso";
        System.out.println(second);

        System.out.println(first == second);            // false
        System.out.println(first.equals(second));       // true

        String third = "Ahmad Santoso";
        System.out.println(second == third);            // false
        System.out.println(second.equals(third));       // true
    }
}
