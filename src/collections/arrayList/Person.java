package collections.arrayList;

import java.util.ArrayList;

public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Name: " + name +"  "+ "Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Lalit", 24);
        Person p2 = new Person("Sachin", 23);
        Person p3 = new Person("Aman", 21);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(new Person("Azad", 20));
        personList.add(new Person("Anmol", 22));

        personList.forEach(data -> data.displayInfo());
    }
}
