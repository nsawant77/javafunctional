package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        //traditional way
        int no = increment(0);
        System.out.println(no);

        //Function takes 1 arg anf produces 1 result
        int incrementedNo = incrementByOneFunction.apply(1);
        System.out.println("incremented no = "+incrementedNo);

        int multiply = multiplyBy10Function.apply(incrementedNo);
        System.out.println("multiplied by 10 = "+multiply);

        int incrementBy1AndThenMulitplyBy10 = incrementBy1AndThenMulitplyBy10Function.apply(2);
        System.out.println("Add by 1 AndThen Multiply by 10 = "+incrementBy1AndThenMulitplyBy10);

        //BiFunction takes 2 arg anf produces 1 result
        String addBy1AndMultiplyBy = addBy1AndMultiplyByFunction.apply(2,2);
        System.out.println("Eval (2+1) * 2 = "+addBy1AndMultiplyBy);

    }

    static Function<Integer,Integer> incrementByOneFunction = num -> num + 1;

    static Function<Integer, Integer> multiplyBy10Function = num -> num * 10;

    static Function<Integer, Integer> incrementBy1AndThenMulitplyBy10Function = incrementByOneFunction.andThen(multiplyBy10Function);

    static BiFunction<Integer, Integer, String> addBy1AndMultiplyByFunction = (additionNo, multiplyByNo) -> (additionNo + 1) * multiplyByNo+"";

    static int increment(int n){
        return (n + 1);
    }
}
