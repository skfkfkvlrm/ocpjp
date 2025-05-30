package daily_study.day_02.part_02;

public class TernaryExample {
    public static void main(String[] args) {
        int number = 7;
        String result = (number % 2 == 0) ? "짝수" : "홀수";
        System.out.println("결과: " + result);
    }
}
