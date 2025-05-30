package daily_study.day_04.part_01;

//**Q3. What is the role of the `continue` statement in a loop?**
//A. Ends the loop
//B. Skips current iteration and continues next
//C. Repeats current iteration
//D. Skips to end of method

public class Q3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
