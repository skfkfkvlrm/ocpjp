package daily_study.day_05.part_02;

import java.util.function.BiFunction;

public class LambdaAdder {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        int result = add.apply(10, 20);
        System.out.println("결과: " + result);
    }
}
