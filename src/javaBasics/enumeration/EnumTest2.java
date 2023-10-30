package javaBasics.enumeration;

public class EnumTest2 {
    int PERSONAGE01 = 50;
    final int PERSONAGE02 = 30;
    int PERSONAGE03 = 15;
//    enum Rank {2, 4, 67, 234};  // compilation error
    enum Age { PERSONAGE01, PERSONAGE02, PERSONAGE03 }

    public static void main(String[] args) {
        for(Age age : Age.values()){
            System.out.println(age);
        }
    }
}
