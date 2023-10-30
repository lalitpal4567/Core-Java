package modifiers.accessModifier.protectedModifier.packageOne;

public class Employee {
    private int accountNo = 102030;
    String name = "Raj";
    protected String gender = "male";
    public int age = 23;

    protected Employee(){
        System.out.println("Employee class constructor");
    }
    protected void work(){
        System.out.println("doing work...");
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
        System.out.println("name: " + obj.name);
        System.out.println("age: " + obj.age);
        System.out.println("gender: " + obj.gender);
        System.out.println("account no.: " + obj.accountNo);
        obj.work();
    }
}


