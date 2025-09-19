class Circle {
    double radius, peri, area;

    Circle(double radius) {
        this.radius = radius;
    }

    public void calcPerimeter() {
        this.peri = 2 * Math.PI * this.radius;
    }

    public void calcArea() {
        this.area = Math.PI * Math.pow(this.radius, 2);
    }

    public void describe() {
        System.out.println("Circle Perimeter: " + this.peri);
        System.out.println("Circle Area: " + this.area);
    }
}

class Rectangle {
    double length, breadth, peri, area;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calcPerimeter() {
        this.peri = 2 * (this.length + this.breadth);
    }

    public void calcArea() {
        this.area = this.length * this.breadth;
    }

    public void describe() {
        System.out.println("Rectangle Perimeter: " + this.peri);
        System.out.println("Rectangle Area: " + this.area);
    }
}

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }

    @Override
    public void describe() {
        System.out.println("Square Perimeter: " + this.peri);
        System.out.println("Square Area: " + this.area);
    }
}

public class Driver {
    public static void main(String[] args) {
        Circle c1 = new Circle(7.7);
        c1.calcArea();
        c1.calcPerimeter();
        c1.describe();

        Rectangle r1 = new Rectangle(11, 2);
        r1.calcArea();
        r1.calcPerimeter();
        r1.describe();

        Square s1 = new Square(2);
        s1.calcArea();
        s1.calcPerimeter();
        s1.describe();
    }
}
