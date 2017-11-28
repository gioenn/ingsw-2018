package it.polimi.ingsw.day4;

import java.util.Iterator;

public class GenericStackIterator<T> implements Iterator<T> {

    private GenericStack<T> stack;
    private int cur;

    public GenericStackIterator(GenericStack<T> stack){
        this.stack = stack;
        cur = 0;
    }

    @Override
    public boolean hasNext() {
        return cur < stack.data.size();
    }

    @Override
    public T next() {
        return stack.data.get(cur++);
    }
}
