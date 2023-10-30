package collections.arrayList.arrayListDeclarationInitialization;

import java.util.ArrayList;

// Collections work only on objects
// We can't use primitive data types like int, float, double , char etc.
// We use only wrapper classes like Integer, Float, Double, Long, Character, Boolean
// Short, Byte, String and other objects as well.

public class ArrayListDeclaration {
    public static void main(String[] args) {
//        List<Integer> age = new ArrayList<>();  // valid
//        List<Integer> age = new ArrayList<Integer>();   //  valid
//        ArrayList<Integer> age = new ArrayList<Integer>();  // valid

        ArrayList<Integer> age = new ArrayList<>(); // valid [widely used]
        ArrayList<String> friendList = new ArrayList<>();
        ArrayList<Float> marksObtained = new ArrayList<>();
        ArrayList<Byte> height = new ArrayList<>();
        ArrayList<Short> weightInKg = new ArrayList<>();
        ArrayList<Long> contactNo = new ArrayList<>();
        ArrayList<Double> ageInSeconds = new ArrayList<>();
        ArrayList<Character> alphabets = new ArrayList<>();
        ArrayList<Boolean> yesNoAnswers = new ArrayList<>();

    }

}
