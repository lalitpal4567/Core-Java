package records;

import java.util.Objects;

record Employee(String name, String city, int age){
//    Employee(){}    // compilation error

//    Employee(String name, String city, int age){
//        this.name = name;
//        this.city = city;
//        if(age < 1)
//            throw new IllegalArgumentException();
////            return;
//        this.age = age;
//    }

    Employee{   // compact constructor
        if(age < 1)
            throw new IllegalArgumentException();
    }
    // initialize all the instance variables here
}

public class Recording{

    public static void main(String[] args) {
        Employee obj = new Employee("Lalit", "Noida", -5);

    }
}
