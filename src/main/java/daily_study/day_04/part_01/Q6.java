package daily_study.day_04.part_01;

//**Q6. What happens if the condition in a `while` loop is always `true` and there is no `break`?**
//A. Compilation error
//B. Executes once
//C. Infinite loop
//D. Skips the loop

public class Q6 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Hello World!");
        }
    }
}
