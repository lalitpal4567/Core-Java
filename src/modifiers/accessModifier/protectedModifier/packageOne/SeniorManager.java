package modifiers.accessModifier.protectedModifier.packageOne;

// sub-class
public class SeniorManager extends Employee {
    long contactNo = 9876546541L;
    SeniorManager(){
        System.out.println("SeniorManager class constructor");
    }
    void showEmployeeInfo(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);
        System.out.println("account no.: " + contactNo);
    }

    public static void main(String[] args) {
        SeniorManager obj = new SeniorManager();
        obj.showEmployeeInfo();
        obj.work();
    }
}

