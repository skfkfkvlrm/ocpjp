package daily_study.day_07.part_01;

//**Q5. Which class allows null values and maintains insertion order?**
//A. `HashMap`
//B. `TreeMap`
//C. `LinkedHashMap`
//D. `Hashtable`

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Q5 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1, "One");
        map1.put(3, "Three");
        map1.put(2, "Two");

        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("-------");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "One");
        map2.put(3, "Three");
        map2.put(2, "Two");

        System.out.println(map2.get(1));

        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("-------");

        Map<Integer, String> map3 = new TreeMap<>();
        map3.put(2, "Two");
        map3.put(3, "Three");
        map3.put(1, "One");

        for (Map.Entry<Integer, String> entry : map3.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
