import java.util.function.*;

public class Calculator {
    static protected Supplier<Calculator> instance = Calculator::new;
    static protected BinaryOperator<Integer> plus = (x, y) -> x + y;
    static protected BinaryOperator<Integer> minus = (x, y) -> x - y;
    static protected BinaryOperator<Integer> multiply = (x, y) -> x * y;
    // делить на ноль нельзя, отсюда  java.lang.ArithmeticException
    static protected BinaryOperator<Integer> devide = (x, y) -> y == 0 ? y : x / y;
    static protected UnaryOperator<Integer> pow = x -> x * x;
    static protected UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    static protected Predicate<Integer> isPositive = x -> x > 0;
    static protected Consumer<Integer> println = System.out::println;
}
