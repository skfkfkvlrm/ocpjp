package daily_study.day_08.part_02;

import java.util.Scanner;

public class InputValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        do {
            System.out.print("숫자를 입력하세요: ");
            while (!sc.hasNextInt()) {
                System.out.print("잘못된 입력입니다. 다시 입력하세요: ");
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);
        System.out.println("입력된 양의 정수: " + number);
    }
}
