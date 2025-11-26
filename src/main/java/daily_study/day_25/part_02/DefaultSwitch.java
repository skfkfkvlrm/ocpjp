package daily_study.day_25.part_02;

public class DefaultSwitch {
    public static void main(String[] args) {
        int x = 5;

        switch (x) {
            case 1:
            case 2:
                System.out.println("1 또는 2");
                break;
            default:
                System.out.println("해당 없음");
        }
    }
}
