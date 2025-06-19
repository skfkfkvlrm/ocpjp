package daily_study.day_09.part_02;

public class User {
    private String name;
    private int age;

    public User() {
        this("Unknown");
    }

    public User(String name) {
        this(name, 0);
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }

    public static void main(String[] args) {
        new User().printInfo();
        new User("Alice").printInfo();
        new User("Bob", 25).printInfo();
    }
}
