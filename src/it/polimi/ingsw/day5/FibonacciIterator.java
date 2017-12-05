package it.polimi.ingsw.day5;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {

    private int max;
    private int cont = 0;
    private int prev1 = 1;
    private int prev2 = 1;

    public FibonacciIterator(int max){
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return cont <= max;
    }

    @Override
    public Integer next() {

        int res;

        if (cont < 2){
            res = 1;
        }
        else {
            res = prev1 + prev2;
            prev1 = prev2;
            prev2 = res;
        }

        cont++;

        return res;
    }

    public static void main(String[] args){
        Iterator<Integer> fib = new FibonacciIterator(10);

        while(fib.hasNext())
            System.out.println(fib.next());
    }
}
