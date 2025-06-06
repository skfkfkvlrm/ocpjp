package daily_study.day_08.part_01;

//**Q6. Which of the following converts an array to a list?**
//A. `Arrays.list(arr)`
//B. `List.of(arr)`
//C. `Arrays.toList(arr)`
//D. `Arrays.asList(arr)`

import java.util.Arrays;
import java.util.List;

public class Q6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "World");
        System.out.println(list);
    }
}
