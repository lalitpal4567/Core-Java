package nestedClass.localClass;

public class PrintNumber {
    private int length = 5;
    public void calculate(){
        final int width = 20;
        class Calculator{
            public void multiply(){
                System.out.println(width * length);
            }
        }
        Calculator obj = new Calculator();
        obj.multiply();
    }

    public static void main(String[] args) {
        PrintNumber obj = new PrintNumber();
        obj.calculate();
    }
}
