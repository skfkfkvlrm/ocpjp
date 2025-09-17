package daily_study.day_19.part_02;

import java.util.List;

public class FlatMapTest {
    public static void main(String[] args) {
        List<List<String>> data = List.of(
                List.of("A", "B"),
                List.of("C", "D"),
                List.of("E")
        );

        data.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
