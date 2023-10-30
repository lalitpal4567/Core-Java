package modifiers.accessModifier.publicModifier.packageOne;

// sub-class
public class SeniorManager extends Employee{
    public long contactNo = 9876546541L;
    public SeniorManager(){
        System.out.println("SeniorManager class constructor");
    }
    public void showEmployeeInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        SeniorManager obj = new SeniorManager();
        obj.showEmployeeInfo();
        obj.work();
    }
}
