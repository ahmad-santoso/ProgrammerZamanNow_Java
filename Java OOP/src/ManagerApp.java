public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Anto");
        manager.sayHello("Tray");

        var vp = new VicePresident("Santoso");
        vp.sayHello("Tray");

        System.out.println(manager);
        System.out.println(manager.toString());         // contoh object class (toString contoh bawaan method objek)
        System.out.println(vp);
        System.out.println(vp.toString());
    }
}
