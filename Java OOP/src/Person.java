class Person {
    String name; // field
    String address;  // field
    final String country = "Indonesia";  // field

    Person(String name, String address) {    // ini constructor person biasa
        this.name = name;              // this buat akses name yang ada di parameter
        this.address = address;
    }

    Person(String paramName) {          // costructor overloading
        this(paramName, null);    // memanggil constructor lain
    }

    Person() {                          // costructor overloading
        this(null);
    }

    void sayHello(String name) { // method
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }
}
