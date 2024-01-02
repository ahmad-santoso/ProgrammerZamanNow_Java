class Manager extends Employee{

    String company;

    Manager(String name) {      // Constuctor
        super(name);
    }

    Manager(String name,String company) {      // Constuctor
        super(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name is Manager " + this.name);
    }
}
