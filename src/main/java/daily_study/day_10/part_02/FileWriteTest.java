package daily_study.day_10.part_02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriteTest {
    public static void main(String[] args) {
        Path path = Path.of("notexist", "output.txt");

        try {
            Files.writeString(path, "내용을 씁니다.");
        } catch (IOException e) {
            System.out.println("파일 쓰기 오류: " + e.getMessage());
        }
    }
}
//"notexist",