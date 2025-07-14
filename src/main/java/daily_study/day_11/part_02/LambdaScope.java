package daily_study.day_11.part_02;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.function.Supplier;

public class LambdaScope {
    public static void main(String[] args) {
        int base = 10;

        Supplier<Integer> s = () -> base + 5;

        System.out.println("람다 결과: " + s.get());
    }
}
