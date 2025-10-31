package daily_study.day_22.part_02;

public class JoinExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("첫 번째 스레드 실행");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("두 번째 스레드 실행");
        });

        try {
            t1.start();
            t1.join(); // t1 종료 대기
            t2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

