package day_03.part_02;

public class SwitchFallThrough {
    public static void main(String[] args) {
        int num = 1;

        switch (num) {
            case 1:
                System.out.println("1입니다");
            case 2:
                System.out.println("2입니다");
            default:
                System.out.println("기타");
        }
    }
}
