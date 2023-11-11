package stream.streamProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 1. Filter and Map with Grouping:
// Given a list of Person objects, filter out persons younger than 30,
// and then group the remaining persons by their age.
class Employee{
    private String name;
    private int age;
    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'';
    }
}

public class FilterAndMapWithGrouping {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Shekhar", 23));
        employees.add(new Employee("Ayush", 33));
        employees.add(new Employee("Gourav", 28));
        employees.add(new Employee("Keshav", 33));
        employees.add(new Employee("Himanshu", 18));
        employees.add(new Employee("Manan", 28));
        employees.add(new Employee("Ishu", 28));
        employees.add(new Employee("kartik", 23));

        Map<Integer, List<Employee>> result = employees.stream()
                .filter(person -> person.getAge() < 30)
                .collect(Collectors.groupingBy(emp -> emp.getAge()));

        result.forEach((age, personList) ->
            System.out.println(age + ": " + personList));


    }
}
