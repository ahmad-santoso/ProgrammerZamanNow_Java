public class MethodParameter {
    public static void main(String[] args) {
        // Method Parameter
        sayHello("Ahmad", "Santoso");
        sayHello("Masant", "Tray");
    }
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}