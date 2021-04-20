package patterns.behavioral.visitor;

public class JsonVisitor implements Visitor {

    @Override
    public String visit(Point point) {
        return "{ x : " + point.getX() + ", y : " + point.getY() + " }";
    }

    @Override
    public String visit(Line line) {
        return "{ x1 : " + line.getX1() + ", y1 : " + line.getY1()
                + ", x2 : " + line.getX2() + ", y2 : " + line.getY2() + " }";
    }
}
