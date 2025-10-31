package daily_study.day_22.part_02;

public class AliveCheck {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {}
        });

        System.out.println("스레드 시작 전: " + t.isAlive());
        t.start();
        System.out.println("스레드 시작 직후: " + t.isAlive());

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("스레드 종료 후: " + t.isAlive());
    }
}
