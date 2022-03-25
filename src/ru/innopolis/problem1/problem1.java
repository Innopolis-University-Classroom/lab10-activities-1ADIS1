interface ShapeFactory {
    Shape createShape();
}

class CircleFactory implements ShapeFactory {
    @Override
    public Circle createShape() {
        return new Circle();
    }
}

abstract class Shape {
    public abstract double getArea();
}

class Circle extends Shape {
    public double radius;

    public Circle() {
        this.radius = 0;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    public double length;

    public Square() {
        this.length = 0;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}

class Rectangle extends Shape {
    public double length;
    public double width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
