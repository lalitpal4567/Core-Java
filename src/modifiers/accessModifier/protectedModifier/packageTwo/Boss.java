package modifiers.accessModifier.protectedModifier.packageTwo;

import modifiers.accessModifier.protectedModifier.packageOne.Employee;

public class Boss {
    public String gender = "male";
    public Boss(){
        System.out.println("Boss class constructor");
    }
    public void showData(Employee obj){
//        System.out.println("name: " + obj.name);    //  compilation error
        System.out.println("age: " + obj.age);
//        System.out.println("gender: " + obj.gender);    // compilation error
//        System.out.println("account no.: " + obj.accountNo);    // compilation error
    }

    public static void main(String[] args) {
//        Employee obj = new Employee();  // compilation error
        Boss obj2 = new Boss();
//        obj2.showData(obj);     // compilation error
//        obj.work();
    }
}

