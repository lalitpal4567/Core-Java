package collections.arrayList.sortingArrayList;

import java.util.ArrayList;
import java.util.Comparator;

class Person{
    private String name;
    private int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public String toString(){
        return "Name: " + name + "  Age: " + age;
    }
}
public class ArrayListCustomSortDemo {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Lalit", 23));
        people.add(new Person("Sachin", 22));
        people.add(new Person("Anmol", 22));
        people.add(new Person("Aman", 24));

        System.out.println(people);

        // sort people by their age
        people.sort((person1, person2) ->{
            return person1.getAge() - person2.getAge();
        });

        // or
//        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println(people);
    }
}
