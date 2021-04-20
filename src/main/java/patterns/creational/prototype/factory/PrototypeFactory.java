package patterns.creational.prototype.factory;

import patterns.creational.prototype.shape.Circle;
import patterns.creational.prototype.shape.Rectangle;
import patterns.creational.prototype.shape.Shape;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PrototypeFactory {

    private Map<String, Shape> cache = new HashMap<>();

    public PrototypeFactory() {
        Shape rectangle = new Rectangle("blue", 2, 3);
        Shape circle = new Circle("red", 4);

        cache.put("blue rectangle 2x3", rectangle);
        cache.put("red circle 4", circle);
    }

    public Shape put(String key, Shape shape) {
        return cache.put(key, shape);
    }

    public Optional<Shape> get(String key) {
        return Optional.ofNullable(
                cache.get(key).clone()
        );
    }
}
