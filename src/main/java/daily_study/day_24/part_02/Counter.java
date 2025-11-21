package daily_study.day_24.part_02;

public class Counter {
    static int globalCount = 0;
    int localCount = 0;

    public void increment() {
        globalCount++;
        localCount++;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.increment();
        c1.increment();
        c2.increment();

        System.out.println("c1 local: " + c1.localCount);
        System.out.println("c2 local: " + c2.localCount);
        System.out.println("global: " + Counter.globalCount);
    }
}
