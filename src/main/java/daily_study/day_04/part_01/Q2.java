package daily_study.day_04.part_01;

//**Q2. What is the minimum number of executions of a `do-while` loop?**
//A. 0
//B. 1
//C. Depends on the condition
//D. Infinite

public class Q2 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("i = " + i++);
        } while (i < 10);
    }
}
