package daily_study.day_06.part_02;

public class InitOrder {
    static {
        System.out.println("1. Static 초기화 블록");
    }

    {
        System.out.println("2. 인스턴스 초기화 블록");
    }

    public InitOrder() {
        System.out.println("3. 생성자");
    }

    public static void main(String[] args) {
        System.out.println("Main 시작");
        InitOrder obj = new InitOrder();
    }
}
