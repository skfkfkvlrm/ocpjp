package daily_study.day_08.part_02;

import java.util.List;

public class ListConversion {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};
        List<String> list = List.of(arr);

        System.out.println("원본 리스트: " + list);
        list.set(0, "Z");
    }
}
