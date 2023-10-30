package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;

class StudentData implements Comparable<StudentData>{
    String name;
    int age;
    StudentData(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "name: " + name + "\tage: " + age + "\n";
    }

    @Override
    public int compareTo(StudentData o) {
        return this.age - o.age;
    }
}
public class CustomSort {
    public static void main(String[] args) {
        ArrayList<StudentData> obj = new ArrayList<>();
        obj.add(new StudentData("Lalit", 24));
        obj.add(new StudentData("Sachin", 23));
        obj.add(new StudentData("Deepesh", 25));
        Collections.sort(obj);

        System.out.println(obj);
    }
}
