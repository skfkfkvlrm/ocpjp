package daily_study.day_20.part_02;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileCheck {
    public static void main(String[] args) {
        Path path = Path.of("data", "log.txt");

        if (Files.exists(path)) {
            System.out.println("파일이 존재합니다.");
        }  else {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}
