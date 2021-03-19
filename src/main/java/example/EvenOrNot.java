package example;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class EvenOrNot {

    static Predicate<Integer> isEven = (num) -> num%2 == 0;
    static Consumer<Integer> consumerNo = (a) -> System.out.println("Test");
    static Supplier<String> even = () -> "Even";
    static Supplier<String> odd = () -> "Odd";
    static Function<Integer, String> evenOrOdd = num -> isEven.test(num) ? even.get() :odd.get();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a no: ");
        Integer no = scan.nextInt();
        System.out.println(evenOrOdd.apply(no));
        //consumerNo.accept(1);

    }
}

