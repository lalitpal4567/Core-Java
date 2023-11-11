package stream.streamProblems;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

// Given a list of persons, filter out those whose age is greater than 25 and
// collect them into a Map where the key is the name and the value is the age.
class Person{
    int age;
    String name;
    Person(String name, int age){
        this.age = age;
        this.name = name;
    }
}

public class FilterAndCollectToMap {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Sachin", 23));
        persons.add(new Person("Akash", 25));
        persons.add(new Person("Vivek", 20));
        persons.add(new Person("Aman", 27));
        persons.add(new Person("Lalit", 24));
        persons.add(new Person("Deepsh", 30));

        Map<String, Integer> personInfo = persons.stream()
                .filter(person -> person.age > 25)
                .collect(Collectors.toMap(person -> person.name, person -> person.age));
//        .collect(Collectors.toMap(person :: name, Person :: age);   // when accessor method are provided
        System.out.println(personInfo);
    }
}
