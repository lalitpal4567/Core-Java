package PatternVariable;

// Java Program to Illustrate instanceof Keyword

interface Animal {

}

class Cat implements Animal {
    public void eating(){
        System.out.println("cat is eating...");
    }
}
class Dog implements Animal {
    public void eating(){
        System.out.println("dog is eating...");
    }
}

public class PatternTest {
    public static void resolveTypeOfObject(Animal animal) {
//        if (animal instanceof Cat) {
//            // Redundant casting
//            Cat cat = (Cat)animal;
//        }
//        else if (animal instanceof Dog) {
//            // Redundant casting
//            Dog dog = (Dog)animal;
//        }

        if (animal instanceof Cat cat) {
            cat.eating();
        }
        else if (animal instanceof Dog dog) {
            dog.eating();
        }
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        resolveTypeOfObject(animal);

        animal = new Cat();
        resolveTypeOfObject(animal);
    }
}

