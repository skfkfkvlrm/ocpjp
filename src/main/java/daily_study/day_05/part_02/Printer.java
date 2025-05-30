package daily_study.day_05.part_02;

public class Printer {
    public void print() {
        System.out.println("기본 출력");
    }

    public void print(String msg) {
        System.out.println("문자열 출력: " + msg);
    }

    public void print(int x, int y) {
        System.out.println("두 수의 합: " + (x + y));
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();
        p.print("Hello World!");
        p.print(3, 7);
    }
}
