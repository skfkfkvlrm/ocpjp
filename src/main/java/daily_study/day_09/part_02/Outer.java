package daily_study.day_09.part_02;

public class Outer {
    static class StaticNested {
        public void greet() {
            System.out.println("Hello from static nested class!");
        }
    }

    public static void main(String[] args) {
        Outer.StaticNested nested = new Outer.StaticNested();
        nested.greet();
    }
}
