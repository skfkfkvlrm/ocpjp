package daily_study.day_23.part_02;

public class NumberSummer {
    public static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(2.5, 7.1));
    }
}
