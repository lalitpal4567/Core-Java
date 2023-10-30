package CLA;

public class DefiningSizeOfArray {
    public static void main(String[] args) {
        args = new String[5];
        args[0] = "Shahrukh Khan";
        args[1] = "Salman Khan";
        args[2] = "Akshay Kumar";
        args[3] = "Sunny Deol";
        args[4] = "Ritik Roshan";
//        args[5] = "Anil Kapoor";    // ArrayIndexOutOfBoundsException

        System.out.println("display elements...");
        for(int index = 0; index < args.length; index++){
            System.out.println(args[index]);
        }
    }
}
