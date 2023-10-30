package records;

interface Address{
    void showAddress();     // abstract method
}
sealed interface FillForm permits Person{
    void fillForm();
}

public record Person(String name, int personID, String city) implements Address, FillForm{
    @Override
    public void showAddress(){
        System.out.println(this.city);
    }

    @Override
    public void fillForm(){
        System.out.println("filling form...");
    }

    public static void main(String[] args) {
        Person obj = new Person("Lalit", 321, "Noida");
        obj.showAddress();
        obj.fillForm();
        System.out.println(obj);
    }
}
