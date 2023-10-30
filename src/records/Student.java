package records;

public record Student(String name, int age) {
//    String gender;  // compilation error (instance fields are not allowed here)
    public static String city;
//    private int id; // compilation error
    public String NameInUpperCase(){
        return this.name.toUpperCase();
    }
//    public static int lengthOfNameString(){   // compilation error
//        return name.length();
//    }
    public static void showMessage(){
        System.out.println("records");
    }
    public static void main(String[] args) {
        Student obj = new Student("Lalit Pal", 23);
        Student obj2 = new Student("Sachin Kumar", 24);


        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(obj.NameInUpperCase());
        Student.showMessage();
        obj2.showMessage();
    }
}
