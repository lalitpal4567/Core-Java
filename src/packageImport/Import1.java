package packageImport;

//import static java.util.Arrays;         // compilation error
import static java.util.Arrays.asList;
//static import java.util.Arrays.asList;      // compilation error

public class Import1 {
    public static void main(String[] args) {
//        Arrays.asList("one");           // compilation error
    }
}
