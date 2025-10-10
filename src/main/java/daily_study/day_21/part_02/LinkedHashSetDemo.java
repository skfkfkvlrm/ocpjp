package daily_study.day_21.part_02;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();
        cities.add("Seoul");
        cities.add("Busan");
        cities.add("Incheon");

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
