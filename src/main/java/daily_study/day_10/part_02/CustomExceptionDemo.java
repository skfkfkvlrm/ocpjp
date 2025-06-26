package daily_study.day_10.part_02;

class NegativeInputException extends Exception {
    public NegativeInputException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            checkInput(-5);
        } catch (NegativeInputException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }

    public static void checkInput(int number) throws NegativeInputException {
        if (number < 0) {
            throw new NegativeInputException("음수는 허용되지 않습니다.");
        }
    }
}
