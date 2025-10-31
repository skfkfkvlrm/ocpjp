package daily_study.day_22.part_02;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable task1 = () -> System.out.println("스레드 1 실행");
        Runnable task2 = () -> System.out.println("스레드 2 실행");

        new Thread(task1).start();
        new Thread(task2).start();
    }
}

