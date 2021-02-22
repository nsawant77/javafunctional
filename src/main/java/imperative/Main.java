package imperative;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<Person>();
                people.add(new Person("John",MALE));
                people.add(new Person("Alisha",FEMALE));
                people.add(new Person("Felicia",FEMALE));
                people.add(new Person("Josh",MALE));

        //Imperative approach
        List<Person> females = new ArrayList<Person>();
        for(Person person : people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female: females){
            System.out.println("Female names are (imperative): "+female.name);
        }

        //Declarative approach

        //filter

        people.stream()
                .filter(person -> person.gender.equals(Gender.FEMALE))
                .collect(Collectors.toList())
                .forEach(name -> System.out.println("Female names are (declarative): "+ name.name));


        //sort



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
