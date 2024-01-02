package programmer.zaman.now.application;

import programmer.zaman.now.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {             // anonymous class
            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };
        HelloWorld indonesia = new HelloWorld() {             // anonymous class
            public void sayHello() {
                System.out.println("Halo");
            }

            public void sayHello(String name) {
                System.out.println("Halo " + name);
            }
        };

        english.sayHello();
        english.sayHello("Anto");

        indonesia.sayHello();
        indonesia.sayHello("Anto");
    }
}
