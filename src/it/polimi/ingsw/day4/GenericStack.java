package it.polimi.ingsw.day4;

import java.util.Iterator;
import java.util.LinkedList;

public class GenericStack<E> implements Iterable<E> {

    LinkedList<E> data = new LinkedList<>();
    private int limit;

    public GenericStack(int max){
        this.limit = max;
    }

    public void push(E elem) {
        if (data.size() == limit)
            throw new OutOfSpaceException();
        else
            data.addFirst(elem);
    }

    public E pop(){
        if (data.size() == 0)
            throw new OutOfDataException();
        else
            return data.removeFirst();
    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<E> {

        int cur = 0;

        @Override
        public boolean hasNext() {
            return cur < data.size();
        }

        @Override
        public E next() {
            return data.get(cur++);
        }

    }


    public static void main(String[] args){

        GenericStack<Integer> stack = new GenericStack<>(10);
        stack.push(1);
        stack.push(7);

        /*
        Iterator<Integer> it = stack.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        */

        for(Integer i : stack){
            System.out.println(i);
        }

    }







}
