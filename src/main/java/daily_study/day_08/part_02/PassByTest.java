package daily_study.day_08.part_02;

public class PassByTest {
    public static void main(String[] args) {
        int number = 10;
        int[] array = {1, 2, 3};

        changePrimitive(number);
        changeArray(array);

        System.out.println("기본형 값: " + number);
        System.out.println("배열 값: " + array[0]);
    }

    private static void changePrimitive(int n) {
        n = 20;
    }

    private static void changeArray(int[] arr) {
        arr[0] = 100;
    }
}
