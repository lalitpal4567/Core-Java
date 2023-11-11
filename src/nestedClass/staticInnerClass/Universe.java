package nestedClass.staticInnerClass;

public class Universe {
    static int age = 10000;
    static class Galaxy {
        void UniverseAge(){  // non-static method
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {
        Universe.Galaxy milkyway = new Universe.Galaxy();
        milkyway.UniverseAge();
    }
}
