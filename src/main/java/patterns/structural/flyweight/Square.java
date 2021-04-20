package patterns.structural.flyweight;

public class Square {
    private Color color;
    private Size size;

    public Square(Color color, Size size) {
        this.color = color;
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }
}
