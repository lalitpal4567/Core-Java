package String.stringClass;

// split() method  returns String[]
// (1) String[] split(String regex)
// (2) String[] split(String regex, int limit)

public class SplitMethod {
    public static void main(String[] args) {
        String str = "Tomorrow is my entrance exam but I didn't study anything";
        String str1 = "MohanLal@Ramdass@Rajendra@Lalit";


        // (1) String[] split(String regex)

        //    String strArr[] = str.split(" ");
        //    for(String s: strArr)   // for each loop
        //    {
        //         System.out.println(s);
        //    }

        String strArr1[] = str1.split("a");
        //    for(String s1 : strArr1)
        //    {
        //     System.out.println(s1);
        //    }

        // (2) String[] split(String regex, int limit)

        String strArr[] = str.split(" ", 3);
        for (String s1 : strArr) {
            System.out.println(s1);
        }

        System.out.println("---------------------------------------");
        // (1) String[] split(String regex)
        //    String strArr2[] = str1.split("@");
        //    for(String s2 : strArr2)
        //    {
        //         System.out.println(s2);
        //    }

        // (2) String[] split(String regex, int limit)
        // String strArr3[] = str1.split("@",1)
        // for(String s3: strArr3)
        // {
        //     System.out.println(s3);
        // }
    }
}
