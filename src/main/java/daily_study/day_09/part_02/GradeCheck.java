package daily_study.day_09.part_02;

enum Grade {
    A, B, C, D, F
}

public class GradeCheck {
    public static void main(String[] args) {
        Grade g = Grade.B;

        switch (g) {
            case A -> System.out.println("Excellent");
            case B -> System.out.println("Good");
            case C -> System.out.println("Fair");
            case D -> System.out.println("Pass");
            case F -> System.out.println("Fail");
        }
    }
}
