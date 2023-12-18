package functionalInterface.builtInFunctionalInterface.supplierInterface;

import java.time.LocalDate;
import java.util.function.Supplier;

// Supplier is often used when constructing new objects.
public class SupplierTest {
    public static LocalDate getDate(Supplier<LocalDate> date){
        return date.get();
    }
    public static void main(String[] args) {
//        Supplier<LocalDate> date = () -> LocalDate.now();
//        Supplier<LocalDate> date2 = LocalDate::now;
//        System.out.println(date.get());
//        System.out.println(date2.get());

        System.out.println(getDate(() -> LocalDate.now()));
    }
}
