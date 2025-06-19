package daily_study.day_09.part_02;

public class InitTest {
    static {
        System.out.println("1. Static block");
    }

    {
        System.out.println("2. Instance block");
    }

     public InitTest() {
        System.out.println("3. Constructor");
     }

     public static void main(String[] args) {
        System.out.println("Main 시작");
        new InitTest();
     }
}
