public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Ahmad Santoso", "Tigaraksa");
        // person1.name = "Ahmad Santoso";
        // person1.address = "Tigaraksa";
        // person1.country = "Amerika";        // Tidak bisa karena di Person country final

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Anto");   // manggil method

        Person person2 = new Person("Masant");

        Person person3;
        person3 = new Person();
        person3.name = "Tray";
        person3.sayHello("Anto");
    }
}
