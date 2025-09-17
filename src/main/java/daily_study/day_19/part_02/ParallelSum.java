package daily_study.day_19.part_02;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelSum {
    public static void main(String[] args) {
        List<Integer> nums = IntStream.range(1, 1_000_000).boxed().toList();

        long start = System.currentTimeMillis();
        int sum = nums.parallelStream()
                .reduce(0, Integer::sum);
        long end = System.currentTimeMillis();

        System.out.println("합계: " + sum);
        System.out.println("소요 시간(ms): " + (end - start));
    }
}
