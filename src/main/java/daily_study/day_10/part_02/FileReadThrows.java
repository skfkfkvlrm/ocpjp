package daily_study.day_10.part_02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReadThrows {
    public static void main(String[] args) throws IOException {
        readFile("D://sample.txt");
    }

    public static void readFile(String fileName) throws IOException {
        List<String> lines = Files.readAllLines(Path.of(fileName));
        for (String line : lines) {
            System.out.println(line);
        }
    }
}

