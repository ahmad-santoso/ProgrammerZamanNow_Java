package programmer.zaman.now.application;

import programmer.zaman.now.annotation.Fancy;
import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;

@Fancy(name = "AnimalApp", tage = {"application", "java"})      // Ini Annotation
public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Anto");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("Print Level");
        for (var values : Level.values()) {
            System.out.println(values);
        }
    }
}
