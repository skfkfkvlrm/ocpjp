package daily_study.day_11.part_02;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        List<String> names = List.of("Kim", "Lee", "Park");

        Consumer<String> printer = name -> System.out.println("이름: " + name);

        names.forEach(printer);
    }
}
