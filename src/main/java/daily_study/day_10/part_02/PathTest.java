package daily_study.day_10.part_02;

import java.nio.file.Path;

public class PathTest {
    public static void main(String[] args) {
        Path p = Path.of("data", "log", "output.txt");
        System.out.println("파일 경로: " + p.toString());
    }
}
