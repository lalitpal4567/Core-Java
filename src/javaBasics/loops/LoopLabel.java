package javaBasics.loops;

public class LoopLabel {
    public static void main(String[] args) {
         for(int i = 0; i < 5; i++){
         label:   for(int j = 0; j < 5; j++){
                if(true){
                    break label;
                }
            }
            System.out.print(i + "\t");
        }
    }
}
