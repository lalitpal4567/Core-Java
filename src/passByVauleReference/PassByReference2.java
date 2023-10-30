package passByVauleReference;

public class PassByReference2 {
    public static void render(StringBuilder name){
        name.append(" :-)");
        System.out.println("inside render method: " + name);
    }

    public static void main(String[] args) {
        StringBuilder dogName = new StringBuilder("labrador");
        System.out.println(dogName);

        System.out.println("after changing...");
        render(dogName);
        System.out.println(dogName);    // husky
    }
}
