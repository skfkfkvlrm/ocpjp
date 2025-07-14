package daily_study.day_11.part_01;

//**Q4. What does `Optional.ofNullable(null)` return?**
//A. `null`
//B. `Optional.empty()`
//C. `Optional.of(null)`
//D. `Runtime Exception`

import java.util.Optional;

public class Q4 {
    public static void main(String[] args) {
        System.out.println(Optional.ofNullable(null));
    }
}
