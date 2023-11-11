package stream;

import java.util.ArrayList;

// Filter those names which starts from capital A

public class StreamOfCollection {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Sachin");
        names.add("Lalit");
        names.add("Azad");
        names.add("Ayush");
        names.add("Pankaj");
        names.add("Diya");
        names.add("Tannu");
        names.add("Shivraj");
        names.add("Raj");
        names.add("Nandini");
        names.add("Binod");
        names.add("Aijaj");

        names.stream().filter((name) -> name.startsWith("A"))
                .forEach(name -> System.out.println(name));       //  Azad
                                                                  //  Ayush
                                                                  //  Aijaj
    }
}
