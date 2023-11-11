package stream.streamProblems;

import java.util.ArrayList;
import java.util.OptionalDouble;

// Given a list of Employee objects, filter out employees with a salary less than 5000
// and then calculate the average salary of the remaining employees.
class Employee2{
    private String name;
    private int salary;
    Employee2(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return this.getName();
    }
    public int getSalary(){
        return this.salary;
    }
}

public class FilterAndMapWithAveraging {
    public static void main(String[] args) {
        ArrayList<Employee2> employees = new ArrayList<>();
        employees.add(new Employee2("Sachin", 8000));
        employees.add(new Employee2("Lalit", 6000));
        employees.add(new Employee2("Prince", 7000));
        employees.add(new Employee2("Aman", 10000));
        employees.add(new Employee2("Raj", 7000));
        employees.add(new Employee2("Komal", 5000));
        employees.add(new Employee2("Keshav", 4000));
        employees.add(new Employee2("Adnan", 1000));
        employees.add(new Employee2("Sanskriti", 8000));
        employees.add(new Employee2("Diya", 4000));

        OptionalDouble avgSalary = employees.stream()
                .filter(emp -> emp.getSalary() >= 5000)
                .mapToInt(emp -> emp.getSalary())
                .average();


        System.out.println(avgSalary.getAsDouble());
    }
}
