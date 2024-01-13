package programmer.zaman.now.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String contoh = "10000";

        Integer contohint = Integer.valueOf(contoh);
        System.out.println(contohint);

        Double contohdob = Double.valueOf(contoh);
        System.out.println(contohdob);
    }
}
