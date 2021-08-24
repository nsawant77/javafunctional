package streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {

        List<String> listOfInt = new ArrayList<>();
        listOfInt.add("102");

        List<Person> people = new ArrayList<Person>();
        people.add(new Person("John",Gender.MALE));
        people.add(new Person("Alisha",Gender.FEMALE));
        people.add(new Person("Felicia",Gender.FEMALE));
        people.add(new Person("Josh",Gender.MALE));

        System.out.println("filter....");
        people.stream()
                .filter(person -> person.gender.equals(Gender.FEMALE))
                .collect(Collectors.toList())
                .forEach(person -> System.out.println(person.name));

        System.out.println("map....");
        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("mapToInt....");
        listOfInt.stream()
                .mapToInt(num -> new Integer(num) * 10)
                .forEach(System.out::println);

        System.out.println("map & mapToInt....");
        people.stream()
                .map(name -> name.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        System.out.println("anyMatch....");
        boolean boo = people.stream()
                .anyMatch(person -> person.name.startsWith("Ali"));
        System.out.println(boo);


    }

    static class Person {

        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    enum Gender {
        MALE, FEMALE;
    }
}
