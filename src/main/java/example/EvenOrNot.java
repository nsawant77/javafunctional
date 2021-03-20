package example;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
import java.util.function.*;

public class EvenOrNot {

    static IntPredicate isEven = (num) -> num%2 == 0;
    static Consumer<Integer> consumerNo = (a) -> System.out.println("Test");
    static Supplier<String> even = () -> "Even";
    static Supplier<String> odd = () -> "Odd";
    static Function<Integer, String> evenOrOdd = num -> isEven.test(num) ? even.get() :odd.get();
    static UnaryOperator<String> op = str -> str;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a no: ");
        Integer no = scan.nextInt();
        System.out.println(evenOrOdd.apply(no));
        //consumerNo.accept(1);

    }
}

