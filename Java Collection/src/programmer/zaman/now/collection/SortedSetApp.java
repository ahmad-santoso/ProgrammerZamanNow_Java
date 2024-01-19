package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;
import programmer.zaman.now.collection.data.PersonComparator;

import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator());   // .reversed() untuk membalikkan nilai

        people.add(new Person("Ahmad"));
        people.add(new Person("Santoso"));
        people.add(new Person("Masant"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        // sortedSet.add(new Person("Anto")); error
    }
}
