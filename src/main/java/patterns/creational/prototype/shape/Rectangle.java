package patterns.creational.prototype.shape;

import java.util.Objects;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String colour, int width, int height) {
        super(colour);
        this.width = width;
        this.height = height;
    }

    private Rectangle(Rectangle target) {
        super(target);
        this.width = target.getWidth();
        this.height = target.getHeight();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width &&
                height == rectangle.height &&
                super.equals(rectangle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}
