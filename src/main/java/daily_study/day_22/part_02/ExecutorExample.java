package daily_study.day_22.part_02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(() -> System.out.println("작업 1 실행"));
        executor.submit(() -> System.out.println("작업 2 실행"));

        executor.shutdown(); // 작업 종료 후 스레드 풀 종료
    }
}
