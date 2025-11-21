package daily_study.day_24.part_02;

class Animal {
    Animal() {
        System.out.println("Animal 생성자");
    }
}

public class Dog extends Animal {
    Dog() {
        this("리트리버");
        System.out.println("Dog 기본 생성자");
    }

    Dog(String breed) {
        super();
        System.out.println("Dog 품종 생성자: " + breed);
    }

    public static void main(String[] args) {
        new Dog();
    }
}
