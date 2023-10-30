package initializerBlock.instanceInitializerBlock;

public class InstanceBlock3 {
    int ticketNo;
    static int date;
    static String day;


    InstanceBlock3(int ticketNo, int date) { // runs after initializer block

        System.out.println("Parameterized constructor");
        this.ticketNo = ticketNo;
        InstanceBlock3.date = date;  // static way
    }

    {
        System.out.println("Initializer block");  // runs after main
        day = "Thursday";
    }

    public String toString() {
        return "Ticke n.: "+ticketNo+"  "+"Date: "+date+"  "+"Day: "+day;
    }

    public static void main(String[] args) {
        System.out.println("Main method");  // runs first
        InstanceBlock3 obj = new InstanceBlock3(457,24);
        System.out.println(obj);
    }
}
