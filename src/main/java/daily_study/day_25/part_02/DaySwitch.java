package daily_study.day_25.part_02;

public class DaySwitch {
    public static void main(String[] args) {
        String day = "FRI";

        switch (day) {
            case "MON":
                System.out.println(1);
                break;
            case "TUE":
                System.out.println(2);
                break;
            case "WED":
                System.out.println(3);
                break;
            default:
                System.out.println("기타 요일");
        }
    }
}
