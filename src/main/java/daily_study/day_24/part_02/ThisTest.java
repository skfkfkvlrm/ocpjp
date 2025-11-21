package daily_study.day_24.part_02;

public class ThisTest {
    int value;

    ThisTest() {
        this(100);
    }

    ThisTest(int value) {
        this.value = value;
    }

    public void print() {
        System.out.println("Value: " + this.value);
    }

    public static void main(String[] args) {
        ThisTest t =  new ThisTest();
        t.print();
    }
}
