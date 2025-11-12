package daily_study.day_23.part_02;

import java.util.List;

public class WildcardSum {
    public static double total(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3);
        List<Double> doubles = List.of(2.5, 3.5);

        System.out.println("정수 합계: " + total(integers));
        System.out.println("실수 합계: " + total(doubles));
    }
}
