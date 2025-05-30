package daily_study.day_06.part_02;

public class StaticDemo {
    public static void printMsg() {
        System.out.println("Static method 호출됨");
    }

    public static void main(String[] args) {
        StaticDemo.printMsg();
        StaticDemo demo = new StaticDemo();
        demo.printMsg();
    }
}
