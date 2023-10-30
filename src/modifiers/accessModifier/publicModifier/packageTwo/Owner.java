package modifiers.accessModifier.publicModifier.packageTwo;

import modifiers.accessModifier.publicModifier.packageOne.Employee;

// subclass
public class Owner extends Employee {
    public String city = "Delhi";
    public Owner(){
        System.out.println("Owner class constructor");
    }
    public void displayEmployeeInfo(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }

    public static void main(String[] args) {
        Owner obj = new Owner();
        obj.displayEmployeeInfo();
        obj.work();
    }
}
