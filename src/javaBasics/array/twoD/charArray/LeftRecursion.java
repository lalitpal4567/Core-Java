package javaBasics.array.twoD.charArray;

import java.util.ArrayList;

// Program to find whether a production is recursive or not

public class LeftRecursion {
    public static ArrayList<String> leftRecursion(String[] production){
        ArrayList<String> list = new ArrayList<>();
        boolean status;
        for(String value : production){
            status = false;
            char ch = value.charAt(0);
            for(int index = 1; index < value.length(); index++){
                if(ch == value.charAt(index)) {
                    status = true;
                    break;
                }
            }
            if(status)
                list.add("Recursive");
            else
                list.add("Non-Recursive");

        }
        return list;
    }
    public static void main(String[] args) {
        String[] production = new String[]{"S->Sa", "A->Ab", "C->a", "D->abD"};
        ArrayList<String> booleanList = leftRecursion(production);
        System.out.println(booleanList);
    }
}
