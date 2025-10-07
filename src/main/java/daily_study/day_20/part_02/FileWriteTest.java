package daily_study.day_20.part_02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriteTest {
    public static void main(String[] args) {
        Path path = Path.of("data", "output.txt");

        try {
            Files.writeString(path, "새로운 내용이 저장됩니다.");
            System.out.println("파일 쓰기 완료");
        } catch (IOException e) {
            System.out.println("쓰기 실패: " + e.getMessage());
        }
    }
}
