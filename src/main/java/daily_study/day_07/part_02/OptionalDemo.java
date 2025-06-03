package daily_study.day_07.part_02;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String name = null;

        Optional<String> optionalName = Optional.ofNullable(name);
        System.out.println(optionalName.orElse("기본 이름"));
        optionalName.ifPresent(n -> System.out.println("이름 있음: " + n));
    }
}
