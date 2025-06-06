package daily_study.day_08.part_01;

//**Q2. What does the following code print?**
//
//for (int i = 0; i < 5; i++) {
//        if (i == 3) break;
//        System.out.print(i + " ");
//}
//
//A. 0 1 2 3 4
//B. 0 1 2
//C. 0 1 2 3
//D. 1 2 3

public class Q2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) break;
            System.out.print(i + " ");
        }
    }
}
