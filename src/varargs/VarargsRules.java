package varargs;

/**
 * A method can have at most one varargs parameter
 * If a method contains a varargs parameter, it must be the last parameter int the list.
 */
public class VarargsRules {
    public void walk1(int... steps){}
    public void walk2(int start, int... steps){}
//    public void walk3(int... steps, int start){}    // compilation error
//    public void walk4(int... start, int... steps){} // compilation error
}
