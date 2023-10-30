package modifiers.accessModifier.publicModifier.packageOne;

 public class Employee {
    public String name = "Raj";
    public int age = 23;
    public Employee(){
        System.out.println("Employee class constructor");
    }
    public void work(){
        System.out.println("doing work...");
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
        System.out.println(obj.name);
        System.out.println(obj.age);
        obj.work();
    }
}

