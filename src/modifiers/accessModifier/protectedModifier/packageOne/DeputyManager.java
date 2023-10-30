package modifiers.accessModifier.protectedModifier.packageOne;

// non-sub class
public class DeputyManager {
    protected String job = "Software Developer";
    protected DeputyManager(){
        System.out.println("DeputyManager class constructor");
    }
    protected void accessEmployeeDetails(Employee obj){
        System.out.println("name: " + obj.name);
        System.out.println("age: " + obj.age);
        System.out.println("gender: " + obj.gender);
//        System.out.println("account no.: " + obj.contactNo);    // compilation error
        obj.work();
    }

    public static void main(String[] args) {
        DeputyManager obj = new DeputyManager();
        Employee obj2 = new Employee();
        obj.accessEmployeeDetails(obj2);
    }
}

