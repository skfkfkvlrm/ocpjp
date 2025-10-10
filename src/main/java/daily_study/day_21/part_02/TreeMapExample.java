package daily_study.day_21.part_02;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Banana", 2);
        map.put("Apple", 5);
        map.put("Cherry", 3);

        map.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
