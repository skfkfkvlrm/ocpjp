package day_05.part_02;

public class ArrayExample {
    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20};

        int sum = 0;
        //TODO: 배열 순회하며 합계 계산
        for (int number : nums) {
            sum += number;
        }

        System.out.println("총합: " + sum);
    }
}
