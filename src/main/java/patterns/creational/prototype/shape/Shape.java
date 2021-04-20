package patterns.creational.prototype.shape;

import java.util.Objects;

public abstract class Shape {
    private String colour;

    public Shape(String colour) {
        this.colour = colour;
    }

    public Shape(Shape target) {
        this.colour = target.getColour();
    }

    public String getColour() {
        return colour;
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(colour, shape.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour);
    }
}
