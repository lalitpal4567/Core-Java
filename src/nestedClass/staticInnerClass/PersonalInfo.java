package nestedClass.staticInnerClass;

public class PersonalInfo {
    static String city = "noida";

    static class Address {
        static String district = "Ghaziabad";
        static void addressInfo() {
            System.out.println("city: "+city+"  District: "+district);
        }
    }
    public static void main(String[] args) {
        PersonalInfo.Address.addressInfo(); // no need to create object
//        Address.addressInfo();  // valid
    }
}
