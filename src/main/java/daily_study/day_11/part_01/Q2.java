package daily_study.day_11.part_01;

//**Q2. What does the following code print?**
//Predicate<String> p = s -> s.isEmpty();
//System.out.println(p.test(""));
//
//A. true
//B. false
//C. null
//D. Compilation error

import java.util.function.Predicate;

public class Q2 {
    public static void main(String[] args) {
            Predicate<String> p = s -> s.isEmpty();
            System.out.println(p.test(""));
    }
}
