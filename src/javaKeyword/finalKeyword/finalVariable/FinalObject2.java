package javaKeyword.finalKeyword.finalVariable;

import java.util.Arrays;

public class FinalObject2 {
    final char[] ch1 = {'m','e','d','i','a'};
    char[] ch2 = {'m','e','d','i','a',' ','p','l','a','y','e','r'};

    FinalObject2(){
//        ch1 = ch2;   // compilation error
        ch1[0] = 'p';
//        ch[5] = 'c';    // ArrayIndexOutOfBoundsException
        ch2[1] = 'o';
    }

    public static void main(String[] args) {
        FinalObject2 obj = new FinalObject2();
        System.out.println(Arrays.toString(obj.ch1));
        System.out.println(Arrays.toString(obj.ch2));
    }
}
