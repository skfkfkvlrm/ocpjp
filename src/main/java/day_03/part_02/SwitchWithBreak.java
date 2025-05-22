package day_03.part_02;

public class SwitchWithBreak {
    public static void main(String[] args) {
        int option = 2;

        switch (option) {
            case 1:
                System.out.println("옵션 1 선택");
                break;
            case 2:
                System.out.println("옵션 2 선택");
                break;
            default:
                System.out.println("알 수 없는 옵션");
        }
    }
}
