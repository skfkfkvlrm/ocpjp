package daily_study.day_19.part_02;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapCollect {
    public static void main(String[] args) {
        List<String> words = List.of("java", "stream", "lambda");

        List<String> upper = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upper);
    }
}
