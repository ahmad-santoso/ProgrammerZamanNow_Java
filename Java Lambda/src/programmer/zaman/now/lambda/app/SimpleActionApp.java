package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Ahmad";
//            }
//        };
//        System.out.println(simpleAction1.action("Ahmad"));
//
//
//        SimpleAction simpleAction2 = (String name) -> {                // lambda
//            return "Ahmad";
//        };
//        System.out.println(simpleAction2.action("Ahmad"));


        SimpleAction simpleAction1 = (String value) -> {                   // lambda menggunakan blok
            return "Hello " + value;
        };

        SimpleAction simpleAction2 = (name) -> {                // lambda menggunakan blok tanpa tipe data
            return "Hello " + name;
        };

        SimpleAction simpleAction3 = (String value) -> "Hello " + value;   // lambda tanpa blok

        SimpleAction simpleAction4 = (value) -> "Hello " + value;      // lamba tanpa blok tanpa tipe data

        SimpleAction simpleAction5 = value -> "Hello " + value;  // lambda tanpa blok, tanpa tipe data, tanpa parameter

        SimpleAction simpleAction6 = name -> "Ahmad";
    }
}
