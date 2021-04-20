package patterns.behavioral.iterator;

public class Array<T> {
    private T[] array;

    public Array(T... elements) {
        this.array = elements;
    }

    public T get(int index) {
        return array[index];
    }

    public int length() {
        return array.length;
    }

    public Iterator<T> iterator() {
        return new ArrayIterator<>(this);
    }

    public Iterator<T> reverseIterator() {
        return new ArrayReverseIterator<>(this);
    }
}
