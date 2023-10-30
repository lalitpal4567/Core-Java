package modifiers.accessModifier.publicModifier.packageOne;

// non-sub class
public class DeputyManager {
    public String job = "Software Developer";
    public DeputyManager(){
        System.out.println("DeputyManager class constructor");
    }
    public void accessEmployeeDetails(Employee obj){
        System.out.println(obj.name);
        System.out.println(obj.age);
        obj.work();
    }

    public static void main(String[] args) {
        DeputyManager obj = new DeputyManager();
        Employee obj2 = new Employee();
        obj.accessEmployeeDetails(obj2);
    }
}
