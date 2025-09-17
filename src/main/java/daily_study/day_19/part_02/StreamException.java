package daily_study.day_19.part_02;

import java.util.List;

public class StreamException {
    public static void main(String[] args) {
        List<String> nums = List.of("10", "20", "a", "30");

        nums.stream()
                .map(s -> {
                    try {
                        return Integer.parseInt(s);
                    }  catch (NumberFormatException e) {
                        return -1;
                    }
                })
                .forEach(System.out::println);
    }
}
