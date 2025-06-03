package daily_study.day_07.part_02;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> people = new LinkedHashMap<>();
        people.put("Kim", 30);
        people.put("Lee", 25);
        people.put("Park", 35);

        for (String name : people.keySet()) {
            System.out.println(name + " : " + people.get(name));
        }
    }
}
