package javagenerics;

import java.util.Iterator;

public class MyCollection<E> implements Iterable<E>{

    public Iterator<E> iterator() {
        return new MyIterator<E>();
    }
}