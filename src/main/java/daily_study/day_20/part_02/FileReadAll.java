package daily_study.day_20.part_02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReadAll {
    public static void main(String[] args) {
        Path path = Path.of("data", "sample.txt");

        try {
            List<String> lines = Files.readAllLines(path);
            lines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("읽기 실패: " + e.getMessage());
        }
    }
}
