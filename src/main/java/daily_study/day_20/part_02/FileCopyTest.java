package daily_study.day_20.part_02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCopyTest {
    public static void main(String[] args) {
        Path source = Path.of("data", "source.txt");
        Path target = Path.of("data", "backup.txt");

        try {
            Files.copy(source, target);
            System.out.println("복사 완료");
        } catch (IOException e) {
            System.out.println("복사 실패: " + e.getMessage());
        }
    }
}
