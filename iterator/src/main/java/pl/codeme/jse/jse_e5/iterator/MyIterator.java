package pl.codeme.jse.jse_e5.iterator;

import java.util.Iterator;

public class MyIterator implements Iterable<Object>, Iterator<Object> {

    private Object[] items = { "1", "2", "3", "4" };
    private int ix = 0;

    public static void main(String[] args) {
        MyIterator iter = new MyIterator();
        for(Object item : iter) {
            System.out.println(item);
        }
    }

    @Override
    public Iterator<Object> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        if(ix < items.length) {
            return true;
        }

        return false;
    }

    @Override
    public Object next() {
        return items[ix++];
    }

}
