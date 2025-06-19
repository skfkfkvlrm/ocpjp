package daily_study.day_09.part_01;

//**Q7. What is the output of the following enum code?**
//enum Level {
//    LOW, MEDIUM, HIGH
//}
//
//public class EnumTest {
//    public static void main(String[] args) {
//        Level l = Level.HIGH;
//        System.out.println(l);
//    }
//}
//
//A. l
//B. HIGH
//C. Level.HIGH
//D. 2

public class Q7 {
    enum Level {
        LOW, MEDIUM, HIGH
    }
    public static void main(String[] args) {
        Level l = Level.HIGH;
        System.out.println(l);
    }
}
