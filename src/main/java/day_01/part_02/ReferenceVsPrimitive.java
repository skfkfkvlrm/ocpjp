package day_01.part_02;

public class ReferenceVsPrimitive {
    boolean flag;
    int number;
    String text;

    public static void main(String[] args) {
        ReferenceVsPrimitive obj = new ReferenceVsPrimitive();
        System.out.println("boolean 기본값: " + obj.flag);
        System.out.println("int 기본값: " + obj.number);
        System.out.println("String 기본값: " + obj.text);
    }
}
