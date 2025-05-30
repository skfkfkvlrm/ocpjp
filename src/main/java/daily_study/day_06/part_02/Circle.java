package daily_study.day_06.part_02;

interface Drawable {
    void draw();
}

abstract class Shape {
    abstract double area();
}

class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("원을 그립니다.");
    }

    public static void main(String[] args) {
        Circle c = new Circle(3.0);
        c.draw();
        System.out.println("넓이: " + c.area());
    }
}
