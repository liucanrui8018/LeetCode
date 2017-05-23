import java.util.Iterator;

/**
 * Created by 刘灿锐 on 5/22/2017.
 * 284. Peeking Iterator
 * <p>
 * Given an Iterator class interface with methods: next() and hasNext(), design and
 * implement a PeekingIterator that support the peek() operation -- it essentially peek()
 * at the element that will be returned by the next call to next().
 * <p>
 * Here is an example. Assume that the iterator is initialized to the beginning of the list:
 * [1, 2, 3].
 * <p>
 * Call next() gets you 1, the first element in the list.
 * <p>
 * Now you call peek() and it returns 2, the next element. Calling next() after that still
 * return 2.
 * <p>
 * You call next() the final time and it returns 3, the last element. Calling hasNext() after
 * that should return false.
 * <p>
 * Follow up: How would you extend your design to be generic and work with all types, not just
 * integer?
 */
public class PeekingIterator implements Iterator<Integer> {

    private Integer next = null;
    private Iterator<Integer> iter;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        iter = iterator;
        if (iter.hasNext())
            next = iter.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public Integer next() {
        Integer res = next;
        next = iter.hasNext() ? iter.next() : null;
        return res;
    }

}
