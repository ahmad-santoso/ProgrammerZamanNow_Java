public class Variabel {
    public static void main(String[] args) {
        String name = "Ahmad Santoso";
        int age = 19;
        String address = "Tigaraksa";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        System.out.println("========================");

        var firstName = "Ahmad";
        var middleName = "Anto";
        var lastName = "Santoso";

        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);

        System.out.println("========================");

        final String application = "Belajar Java";
        // Akan Error application = "Belajar PHP";

        System.out.println(application);
    }
}