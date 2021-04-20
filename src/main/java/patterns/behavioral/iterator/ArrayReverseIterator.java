package patterns.behavioral.iterator;

public class ArrayReverseIterator<T> implements Iterator<T> {

    private Array<T> array;
    private int index;

    public ArrayReverseIterator(Array<T> array) {
        this.array = array;
        this.index = array.length() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public T next() {
        return array.get(index--);
    }

    @Override
    public void reset() {
        this.index = array.length() - 1;
    }
}
