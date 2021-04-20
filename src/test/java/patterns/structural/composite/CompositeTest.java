package patterns.structural.composite;

import org.junit.Assert;
import org.junit.Test;

public class CompositeTest {

    @Test
    public void testCompositeDrawing() {
        UIItem button = new UIButton();
        UIItem label = new UILabel();
        UIPanel panel = new UIPanel();
        UIWindow window = new UIWindow();
        panel.add(label);
        panel.add(button);
        window.add(panel);

        window.draw();

        Assert.assertTrue(button.isDrawn());
        Assert.assertTrue(label.isDrawn());
        Assert.assertTrue(panel.isDrawn());
        Assert.assertTrue(window.isDrawn());
    }
}
