package initializerBlock.instanceInitializerBlock;

public class InstanceBlock5 {
    String schoolName;
    int age;
    String city;

    InstanceBlock5(String schoolName, int age) {
        this.schoolName = schoolName;
        System.out.println("constructor calling...");

        {                   // initializer block
            System.out.println("initializer block 1");
            this.age = age;
        }
    }

    {
        System.out.println("initializer block 2");
        city = "mumbai";
    }
    public void display() {
        System.out.println("School name : "+schoolName);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        InstanceBlock5 stu1 = new InstanceBlock5("JSS", 12);
        stu1.display();
    }
}
