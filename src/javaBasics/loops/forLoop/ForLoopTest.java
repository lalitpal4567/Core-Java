package javaBasics.loops.forLoop;

public class ForLoopTest {
    private void print(int[] weather) {
        for(int i=0; i++<10 && i<weather.length;) {
            System.out.println(weather[i]);
        }
    }
    public static void main(String[] args) {
     ForLoopTest obj = new ForLoopTest();
//     obj.print(new int[]{2, 5, 1, 6, 7});


        char[] wolf = {'W', 'e', 'b', 'b', 'y'};
//        final int r = wolf.length;
//        for(int w = r-1; r>-1; w = r-1)
//            System.out.print(wolf[w]);



        int q = wolf.length;
        for( ; ; ) {
            System.out.print(wolf[--q]);
            if(q==0) break;
        }

        for(int i = 0,j = 3; i < 5; i++){}
    }


}
