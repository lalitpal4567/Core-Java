package initializerBlock.instanceInitializerBlock;

public class InstanceBlock2 {
    String name;
    int age;
    long contact;

    {
        System.out.println("First block");  // runs after main
        name = "Noddy";
    }
    {
        System.out.println("Second block");  // runs after first block
        age = 10;
    }
    {
        System.out.println("Third block");  // runs after second block
        contact = 9874544874L;
    }

    public String toString() {
        return "Name: "+name+"  "+"Age: "+age+"  "+"Contact: "+contact;
    }

    public static void main(String[] args) {
        System.out.println("Main method");  // runs first
        InstanceBlock2 obj = new InstanceBlock2();
        System.out.println(obj);
    }
}
