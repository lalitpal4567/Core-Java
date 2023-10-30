package modifiers.accessModifier.protectedModifier.packageTwo;

import modifiers.accessModifier.protectedModifier.packageOne.Employee;

// subclass
public class Owner extends Employee {
    public String city = "Delhi";
    public Owner(){
        System.out.println("Owner class constructor");
    }
    public void displayEmployeeInfo(){
//        System.out.println("name: " + name);    // compilation error, default access
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);
//        System.out.println("account no.: " + accountNo);    // compilation error, private access
    }

    public static void main(String[] args) {
        Owner obj = new Owner();
        obj.displayEmployeeInfo();
        obj.work();
    }
}

