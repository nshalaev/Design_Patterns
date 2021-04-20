package patterns.creational.prototype.shape;

import java.util.Objects;

public class Circle extends Shape {
    private int radius;

    public Circle(String colour, int radius) {
        super(colour);
        this.radius = radius;
    }

    private Circle(Circle target) {
        super(target);
        this.radius = target.getRadius();
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius &&
                super.equals(circle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
