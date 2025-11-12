package daily_study.day_23.part_02;

import java.util.ArrayList;
import java.util.List;

public class RawTypeExample {
    public static void main(String[] args) {
        List rawList = new ArrayList();
        rawList.add("Hello");
        rawList.add(123);

        for (Object obj : rawList) {
            System.out.println((String)obj);
        }
    }
}
