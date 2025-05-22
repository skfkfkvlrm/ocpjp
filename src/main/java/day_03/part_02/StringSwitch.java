package day_03.part_02;

public class StringSwitch {
    public static void main(String[] args) {
        String command = "start";

        switch (command) {
            case "start":
                System.out.println("시작합니다");
                break;
            case "stop":
                System.out.println("정지합니다");
            default:
                System.out.println("명령어를 인식할 수 없음");
        }
    }
}
