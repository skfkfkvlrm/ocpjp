package daily_study.day_11.part_02;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        List<String> data = List.of("java", "lambda", "stream");

        List<String> upper = data.stream()
                                 .map(String::toUpperCase)
                                 .collect(Collectors.toList());

        upper.forEach(System.out::println);
    }
}
