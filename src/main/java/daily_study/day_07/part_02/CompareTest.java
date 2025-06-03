package daily_study.day_07.part_02;

public class CompareTest {
    public static void main(String[] args) {
        Integer a = 1000;
        Integer b = 1000;

        String s1 = new String("java");
        String s2 = new String("java");

        System.out.println("Integer == : " + (a == b));
        System.out.println("Integer equals : " + a.equals(b));
        System.out.println("String == : " + (s1 == s2));
        System.out.println("String equals : " + s1.equals(s2));
    }
}
