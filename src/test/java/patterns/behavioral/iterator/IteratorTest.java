package patterns.behavioral.iterator;

import org.junit.Assert;
import org.junit.Test;

public class IteratorTest {

    @Test
    public void testIterator() {
        Array<Integer> array = new Array<>(1, 2, 3);
        Iterator<Integer> iterator = array.iterator();

        testAndIterate(iterator, 1, 2, 3);

        iterator.reset();
        testAndIterate(iterator, 1, 2, 3);
    }

    @Test
    public void testReverseIterator() {
        Array<Integer> array = new Array<>(1, 2, 3);
        Iterator<Integer> iterator = array.reverseIterator();

        testAndIterate(iterator, 3, 2, 1);

        iterator.reset();
        testAndIterate(iterator, 3, 2, 1);
    }

    private void testAndIterate(Iterator<Integer> iterator, Integer... ints) {
        Assert.assertTrue(iterator.hasNext());
        Assert.assertSame(iterator.next(), ints[0]);
        Assert.assertTrue(iterator.hasNext());
        Assert.assertSame(iterator.next(), ints[1]);
        Assert.assertTrue(iterator.hasNext());
        Assert.assertSame(iterator.next(), ints[2]);
        Assert.assertFalse(iterator.hasNext());
    }
}
