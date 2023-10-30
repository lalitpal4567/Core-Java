package passByVauleReference;

class Test0{
    String name;
    int age;
    Test0(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class ReferenceTest {
    public static void checkReference(Object o){
        System.out.println();
    }
    public static void main(String[] args) {
        Test0 obj = new Test0("Lalit", 23);
        checkReference(obj);
    }
}
