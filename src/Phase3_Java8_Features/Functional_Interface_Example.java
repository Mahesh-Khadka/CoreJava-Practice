package Phase3_Java8_Features;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Cricket{
    void player();
}
public class Functional_Interface_Example {
    public static void main(String[] args){
        Cricket c = () -> System.out.println("Virat is a King.");
        c.player();

        //Built-in Functional Interfaces
        Predicate<Integer> check = x -> x > 10;
        System.out.println(check.test(15));

        Consumer<String> print = s -> System.out.println("Hello" + s);
        print.accept("mahesh");

        Function<Integer, Integer> square = n -> n * n;
        System.out.println("Square = " + square.apply(3));


        Supplier<Double> random = ()-> Math.random();
        System.out.println(random.get());

        Supplier<Double> methodRef = Math::random;
        System.out.println(methodRef.get());
    }

}
