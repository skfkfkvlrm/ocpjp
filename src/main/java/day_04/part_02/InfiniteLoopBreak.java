package day_04.part_02;

public class InfiniteLoopBreak {
    public static void main(String[] args) {
        int count = 0;

        while (true) {
            if (count >= 3) break;
            System.out.println("카운트: " + count);
            count++;
        }
    }
}
