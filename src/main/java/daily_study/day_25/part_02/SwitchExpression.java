package daily_study.day_25.part_02;

public class SwitchExpression {
    public static void main(String[] args) {
        int score = 90;

        String grade = switch (score / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            default -> {
                yield "F";
            }
        };
        System.out.println("학점: " + grade);
    }
}
