package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    //Predicate returns a boolean value
    public static void main(String[] args) {
        System.out.println(checkString.or(checkInteger).test("NABCD"));
    }

    static Predicate<String> checkString = string -> string.contains("ABC");

    static Predicate<String> checkInteger = str -> str.length()<=5;
}
