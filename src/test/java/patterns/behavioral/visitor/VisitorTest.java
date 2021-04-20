package patterns.behavioral.visitor;

import org.junit.Assert;
import org.junit.Test;

public class VisitorTest {

    @Test
    public void testPointVisiting() {
        Point point = new Point(2, 3);
        Visitor visitor = new JsonVisitor();
        String jsonString = visitor.visit(point);
        Assert.assertEquals("{ x : 2, y : 3 }", jsonString);
    }

    @Test
    public void testLineVisiting() {
        Line line = new Line(2, 3, 4, 5);
        Visitor visitor = new JsonVisitor();
        String jsonString = visitor.visit(line);
        Assert.assertEquals("{ x1 : 2, y1 : 3, x2 : 4, y2 : 5 }", jsonString);
    }


}
