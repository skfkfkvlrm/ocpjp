package daily_study.day_09.part_01;

//**Q6. What is printed by the following code?**
//public class Test {
//    static {
//        System.out.println("Static");
//    }
//
//    {
//        System.out.println("Instance");
//    }
//
//    public Test() {
//        System.out.println("Constructor");
//    }
//
//    public static void main(String[] args) {
//        new Test();
//    }
//}
//
//A. Static → Constructor → Instance
//B. Instance → Static → Constructor
//C. Static → Instance → Constructor
//D. Constructor → Static → Instance

public class Q6 {
    static {
        System.out.println("Static");
    }

    {
        System.out.println("Instance");
    }

    public Q6() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Q6();
    }
}
