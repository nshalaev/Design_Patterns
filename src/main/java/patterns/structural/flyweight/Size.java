package patterns.structural.flyweight;

public enum Size {
    SMALL(1),
    MEDIUM(2),
    BIG(3),
    LARGE(4);

    private int sidesLength;

    Size(int sidesLength) {
        this.sidesLength = sidesLength;
    }
}
