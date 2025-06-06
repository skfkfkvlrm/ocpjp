package daily_study.day_08.part_02;

public class VarargsSum {
    public static void main(String[] args) {
        printSum(1, 2, 3, 4);
        printSum();
    }

    public static void printSum(int... nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println("합계: " + sum);
    }
}
