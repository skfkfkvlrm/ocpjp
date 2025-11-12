package daily_study.day_23.part_02;

import java.util.ArrayList;
import java.util.List;

public class InstanceofGenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        System.out.println(list instanceof List<String>);

        if (list instanceof List) {
            System.out.println("List 타입입니다");
        }
    }
}
