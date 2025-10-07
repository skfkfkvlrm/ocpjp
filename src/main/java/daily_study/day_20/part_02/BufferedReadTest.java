package daily_study.day_20.part_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReadTest {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("data/input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("파일 읽기 실패: " + e.getMessage());
        }
    }
}
