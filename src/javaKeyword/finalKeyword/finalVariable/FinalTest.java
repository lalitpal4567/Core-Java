package javaKeyword.finalKeyword.finalVariable;

public class FinalTest {
    static final int value;
//    FinalTest(){      // compilation error
//        value = 100;
//    }

//    {         // compilation error
//        value = 100;
//    }

    static{
        value = 100;
    }
    void displayInfo(){
        System.out.println("value: " + value);
    }

    public static void main(String[] args) {
        FinalTest obj = new FinalTest();

        final int data = 200;
        System.out.println("data: " + data);
        System.out.println();
    }
}
