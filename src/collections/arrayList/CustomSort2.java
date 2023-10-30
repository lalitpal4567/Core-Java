package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User{
    String name;
    int age;
    User(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "name: " + name + "\tage: " + age + "\n";
    }
}
class AgeComparator implements Comparator<User>{
    @Override
    public int compare(User o1, User o2) {
        return o2.age - o1.age;
    }
}
class NameComparator implements Comparator<User>{
    @Override
    public int compare(User o1, User o2){
        return o2.name.charAt(0) - o2.name.charAt(0);
    }
}

public class CustomSort2 {
    public static void main(String[] args) {
        List<User> obj = new ArrayList<>();
        obj.add(new User("Lalit", 24));
        obj.add(new User("Sachin", 22));
        obj.add(new User("Azad", 25));

        Collections.sort(obj, new AgeComparator() );

        System.out.println(obj);
        String str = "hi";
    }
}
