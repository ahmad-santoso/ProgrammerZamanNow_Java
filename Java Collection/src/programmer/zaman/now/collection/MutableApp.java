package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Anto");

        person.addHobby("Game");
        person.addHobby("Coding");

        doSomethingHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingHobbies(List<String> hobbies) {
        hobbies.add("Bukan Hobby");     // ini bakal keluar
    }
}
