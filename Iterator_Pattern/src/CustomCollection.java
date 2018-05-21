import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public class CustomCollection<T> extends AbstractCollection<T> implements Collection<T>
{
    private class Elem
    {
        private T value;
        private Elem next;

        public Elem (T value, Elem next)
        {
            this.value = value;
            this.next = next;
        }
    }

    private class CustomIterator implements Iterator<T>
    {
        private Elem cur;

        CustomIterator()
        {
            cur = head;
        }

        @Override
        public boolean hasNext()
        {
            return cur != tail;
        }

        @Override
        public T next()
        {
            T curValue = cur.value;
            cur = cur.next;
            return curValue;
        }
    }

    private Elem head;
    private Elem tail;
    private int size;

    public CustomCollection()
    {
        head = tail = null;
        size = 0;
    }

    @Override
    public boolean add(T t)
    {
        Elem e = new Elem(t, null);
        if (head == null)
            head = e;
        if (tail != null)
            tail.next = e;
        tail = e;
        size++;
        return true;
    }

    public int size()
    {
        return size;
    }

    public Iterator<T> iterator()
    {
        return new CustomIterator();
    }
}
