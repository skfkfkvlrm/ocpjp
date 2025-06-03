package daily_study.day_07.part_02;

import java.util.List;

public class GenericPrinter {
    public static <T> void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        printList(names);
    }
}
