package daily_study.day_05.part_02;

import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            riskyOperation();
        } catch (IOException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }

    public static void riskyOperation() throws IOException {
        // TODO: IOException 강제 발생
        throw new IOException();
    }
}

