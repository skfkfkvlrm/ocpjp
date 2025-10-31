package daily_study.day_22.part_02;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println("현재 카운트: " + count);
    }
}

public class SyncTest {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}
