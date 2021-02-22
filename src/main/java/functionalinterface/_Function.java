package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        int no = increment(0);
        System.out.println(no);

        int incrementedNo = incrementByOneFunction.apply(0);
        System.out.println(incrementedNo);

    }

    static Function<Integer,Integer> incrementByOneFunction = num -> num + 1;

    static int increment(int n){
        return (n + 1);
    }
}
