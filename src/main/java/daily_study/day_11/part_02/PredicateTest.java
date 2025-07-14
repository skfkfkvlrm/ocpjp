package daily_study.day_11.part_02;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println("빈 문자열인가? " + isEmpty.test(""));
        System.out.println("빈 문자열인가? " + isEmpty.test("Java"));
    }
}
