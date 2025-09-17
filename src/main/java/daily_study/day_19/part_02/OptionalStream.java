package daily_study.day_19.part_02;

import java.util.Optional;

public class OptionalStream {
    public static void main(String[] args) {
        Optional<String> maybe = Optional.of("Stream");

        maybe.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
