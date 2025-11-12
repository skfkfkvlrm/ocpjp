package daily_study.day_23.part_02;

public class GenericPrinter {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        String[] words = {"Java", "Generics"};

        printArray(nums);
        printArray(words);
    }
}
