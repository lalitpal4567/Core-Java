package stream.streamProblems;

import java.util.ArrayList;
import java.util.Optional;

// Given a list of Person objects, filter out persons older than 30,
// find the first person, and transform their name to uppercase (if present).
class PersonData{
    private String name;
    private int age;
    PersonData(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}

public class FilterAndMapWithOptional {
    public static void main(String[] args) {
        ArrayList<PersonData> person = new ArrayList<>();
        person.add(new PersonData("Himank", 32));
        person.add(new PersonData("Himanshu", 40));
        person.add(new PersonData("Siddharth", 28));
        person.add(new PersonData("Aman", 25));
        person.add(new PersonData("Harshit", 45));
        person.add(new PersonData("Pulkit", 20));

        Optional<String> personInfo = person.stream()
                .filter(personAge -> personAge.getAge() > 30)
                .map(personName -> personName.getName().toUpperCase())
                .findFirst();

        if (personInfo.isPresent()){
            System.out.println(personInfo.get());
        }else{
            System.out.println("no person found older than 30.");
        }

        personInfo.ifPresentOrElse(
                name -> System.out.println("First person older than 30: " + name),
                () -> System.out.println("No person older than 30 found.")
        );
    }
}
