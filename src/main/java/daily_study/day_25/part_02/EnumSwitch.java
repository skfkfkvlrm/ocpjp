package daily_study.day_25.part_02;

enum Level {
    LOW, MEDIUM, HIGH
}

public class EnumSwitch {
    public static void main(String[] args) {
        Level level = Level.HIGH;

        switch (level) {
            case LOW -> System.out.println("낮음");
            case MEDIUM -> System.out.println("중간");
            case HIGH -> System.out.println("높음");
        }
    }
}
