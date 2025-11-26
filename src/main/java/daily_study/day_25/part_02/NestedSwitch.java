package daily_study.day_25.part_02;

public class NestedSwitch {
    public static void main(String[] args) {
        String role = "ADMIN";
        int level = 2;

        switch (role) {
            case "ADMIN":
                switch (level) {
                    case 1 -> System.out.println("관리자 1단계");
                    case 2 -> System.out.println("관리자 2단계");
                }
                break;
            case "USER":
                System.out.println("일반 사용자");
                break;
        }
    }
}
