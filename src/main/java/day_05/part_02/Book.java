package day_05.part_02;

public class Book {
    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("제목: " + title + ", 가격: " + price);
    }

    public static void main(String[] args) {
        Book b = new Book("Java Basics", 25000);
        b.printInfo();
    }
}
