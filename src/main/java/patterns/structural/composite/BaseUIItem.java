package patterns.structural.composite;

public class BaseUIItem implements UIItem {

    private boolean isDrawn = false;

    @Override
    public void draw() {
        this.isDrawn = true;
    }

    @Override
    public boolean isDrawn() {
        return this.isDrawn;
    }
}
