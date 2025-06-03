package daily_study.day_07.part_02;

class Animal {
    void sound() {
        System.out.println("동물 소리");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("멍멍");
    }
}

public class CastTest {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        Dog d = (Dog) a;
        d.sound();
    }
}
