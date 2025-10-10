package daily_study.day_21.part_02;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;
        Person other = (Person) o;
        return this.name.equals(other.name) && this.age == other.age;
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return name + "(" + age + ")";
    }
}

public class HashSetTest {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person("Kim", 30));
        people.add(new Person("Kim", 30));
        people.add(new Person("Lee", 25));

        System.out.println(people);
    }
}
