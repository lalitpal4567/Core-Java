package modifiers.accessModifier.publicModifier.packageTwo;

import modifiers.accessModifier.publicModifier.packageOne.Employee;

public class Boss {
    public String gender = "male";
    public Boss(){
        System.out.println("Boss class constructor");
    }
    public void showData(Employee obj){
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
    }
    public static void main(String[] args) {
        Employee obj = new Employee();
        Boss obj2 = new Boss();
        obj2.showData(obj);
        obj.work();
    }
}
