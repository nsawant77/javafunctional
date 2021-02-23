package functionalinterface;

import java.util.function.BiFunction;

public class _BiFunction {

    public static void main(String[] args) {

        //BiFunction takes 2 arg anf produces 1 result
        String addBy1AndMultiplyBy = addBy1AndMultiplyByFunction.apply(2,2);
        System.out.println("Eval (2+1) * 2 = "+addBy1AndMultiplyBy);

    }

    static BiFunction<Integer, Integer, String> addBy1AndMultiplyByFunction = (additionNo, multiplyByNo) -> (additionNo + 1) * multiplyByNo+"";
}
