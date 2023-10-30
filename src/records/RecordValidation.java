package records;

record Hen(int numberOfEggs, String name){
    Hen{        // compact constructor
        if(name == null || name.length() < 1){
            throw new IllegalArgumentException();
        }
//        this.name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();    // compilation error
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();    // compilation error
    }
}
public class RecordValidation {
    public static void main(String[] args) {
        Hen obj = new Hen(3, "chameli");
        System.out.println(obj.name());
    }
}
