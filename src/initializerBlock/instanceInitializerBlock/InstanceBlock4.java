package initializerBlock.instanceInitializerBlock;

public class InstanceBlock4 {
    String country;
    int states;

    public void setCountry(String country, int states) {
        this.country = country;
        System.out.println("set country method");

        {                  // initializer block
            System.out.println("initializer block");
            this.states = states;
        }
    }
    public void show() {
        System.out.println("Country: "+country);
        System.out.println("States: "+states);
    }

    public static void main(String[] args) {
        InstanceBlock4 obj = new InstanceBlock4();
        obj.setCountry("America",30);
        obj.show();
    }
}
