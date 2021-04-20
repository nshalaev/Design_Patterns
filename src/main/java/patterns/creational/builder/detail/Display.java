package patterns.creational.builder.detail;

public class Display {
    private double width;
    private double height;

    public Display(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
