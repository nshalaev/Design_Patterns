package patterns.behavioral.visitor;

public interface Visitor {
    String visit(Point point);
    String visit(Line line);
}
