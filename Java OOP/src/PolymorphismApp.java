public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Anto");
        employee.sayHello("Masant");

        employee = new Manager("Anto");
        employee.sayHello("Masant");

        employee = new VicePresident("Anto");
        employee.sayHello("Masant");

        sayHello(new Employee("Anto"));
        sayHello(new Manager("Ahmad"));
        sayHello(new VicePresident("Tray"));
    }

    static void sayHello(Employee employee) {       // buat pengecekan tipe data menggunakan instance of
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
