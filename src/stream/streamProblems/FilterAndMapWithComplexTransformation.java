package stream.streamProblems;

// Given a list of Employee objects, filter out employees with a salary less than 5000/-
// and then transform the remaining employees to a list of strings containing their name and salary.

import java.util.ArrayList;
import java.util.List;

class Worker{
    private String name;
    private int salary;
    Worker(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return this.name;
    }
    public int getSalary(){
        return this.salary;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", salary=" + salary;

    }
}

public class FilterAndMapWithComplexTransformation {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Sachin", 8000));
        workers.add(new Worker("Lalit", 6000));
        workers.add(new Worker("Prince", 7000));
        workers.add(new Worker("Aman", 10000));
        workers.add(new Worker("Raj", 7000));
        workers.add(new Worker("Komal", 5000));
        workers.add(new Worker("Keshav", 4000));
        workers.add(new Worker("Adnan", 1000));
        workers.add(new Worker("Sanskriti", 8000));
        workers.add(new Worker("Diya", 4000));


        List<String> data = workers.stream()
                .filter(person -> person.getSalary() >= 5000)
                .map(person -> person.getName() + "  " + person.getSalary())
                .toList();

        data.forEach(worker -> System.out.println(worker));

    }
}
