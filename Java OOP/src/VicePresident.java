class VicePresident extends Manager {   // extends untuk pewarisan atau inheritence
    VicePresident(String name){            //constructor super
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name is VP " + this.name); // Overriding
    }
}
