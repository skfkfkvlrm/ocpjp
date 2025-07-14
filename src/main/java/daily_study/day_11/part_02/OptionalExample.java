package daily_study.day_11.part_02;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String input = null;

        Optional<String> name = Optional.ofNullable(input);

        System.out.println("값 존재 여부: " + name.isPresent());
        System.out.println("기본값 출력: " + name.orElse("이름 없음"));
    }
}
