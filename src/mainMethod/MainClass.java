package mainMethod;

// Just the order of public, static and final can be changed
// The order of public and static does not matter but return type (void) should always
// come just before the function name.

public class MainClass {
//    public static void main(String[] args) {
//        System.out.println("public static void main(String[] args)");
//    }


//    static public void main(String[] args){
//        System.out.println("static public void main(String[] args)");
//    }


    public static final void main(String[] args){
        System.out.println("public static final void main(String[] args)");
    }

    /////////////////////////////////////////////////////////////////////


//    public void static main(String[] args){   // compilation error, return type must come just before method name
//        System.out.println("public void static main(String[] args)");
//    }


    ///////////////////////////////////////////////////////////////////////

//    static void main(String[] args){      // no compilation error, invalid, program will not be compiled
//        System.out.println("static void main(String[] args)");
//    }

//    public void main(String[] args){      // no compilation error, invalid, program will not be compiled
//        System.out.println("public void main(String[] args)");
//    }

    ////////////////////////////////////////////////////////////////////////
}
