package daily_study.day_03.part_02;

public class GradeChecker {
    public static void main(String[] args) {
        int score = 82;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}
