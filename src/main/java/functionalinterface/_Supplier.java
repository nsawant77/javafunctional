package functionalinterface;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class _Supplier {

    //Represents a supplier of results.
    public static void main(String[] args) {
        String supply = supplier.get();
        System.out.println(supply);
        System.out.println(number.getAsInt());
    }

    static Supplier<String> supplier = () -> "Supplied string value";

    static IntSupplier number = () -> 6*6;

}
