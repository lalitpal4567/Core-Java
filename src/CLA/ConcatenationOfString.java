package CLA;

public class ConcatenationOfString {
    public static void main(String[] words) {
        String sentence = "";

//        words[0] -> Room
//        words[1] -> no
//        words[2] -> :
//        words[3] -> 23

        for(String data : words){
            sentence += data;
        }
        System.out.println(sentence);   // Roomno:23
    }
}
