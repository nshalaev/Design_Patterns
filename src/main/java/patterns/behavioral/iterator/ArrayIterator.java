package patterns.behavioral.iterator;

public class ArrayIterator<T> implements Iterator<T> {

    private Array<T> array;
    private int index;

    public ArrayIterator(Array<T> array) {
        this.array = array;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return array.length() > index;
    }

    @Override
    public T next() {
        return array.get(index++);
    }

    @Override
    public void reset() {
        this.index = 0;
    }
}
