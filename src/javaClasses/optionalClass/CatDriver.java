package javaClasses.optionalClass;

import java.util.ArrayList;
import java.util.Optional;

class Cat{
    private String name;
    private int age;
    Cat(String name, int age){
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
public class CatDriver {
    private ArrayList<Cat> cats;
    CatDriver(){
        cats = new ArrayList<>();
    }
    public void addCat(String name, int age){
        cats.add(new Cat(name, age));
    }
    public Optional<Cat> findCatByName(String name) {
        for(Cat cat : cats){
            if(cat.getName().equals(name)){
                return Optional.ofNullable(cat);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        CatDriver obj = new CatDriver();
        obj.addCat("Luna", 3);
        obj.addCat("Bella", 2);
        obj.addCat("Simba", 4);
        obj.addCat("Coco", 3);
        obj.addCat("Oreo", 5);

        Optional<Cat> myCat = obj.findCatByName("Bela");
        if(myCat.isPresent())
            System.out.println(myCat.get().getAge());
        else
            System.out.println("not found");

    }
}
