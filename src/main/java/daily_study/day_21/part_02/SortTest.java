package daily_study.day_21.part_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return name;
    }
}

public class SortTest {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Kim"),
                new Student("Lee"),
                new Student("Park")
        );

        List<Student> mutable = new ArrayList<>(list);
        Collections.sort(mutable);
        System.out.println(mutable);
    }
}
