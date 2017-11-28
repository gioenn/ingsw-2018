package it.polimi.ingsw.day4;

import it.polimi.ingsw.day1.Stack;

public class SafeStack extends Stack {

    public SafeStack(int max){
        super(max);
    }

    public int safePop() throws OutOfDataException {
        if (current > 0) {
            current--;
            return data[current];
        }
        else throw new OutOfDataException();
    }

    public void safePush(int i) throws OutOfSpaceException {
        if (current == data.length){
            throw new OutOfSpaceException();
        }
        else
            super.push(i);
    }

    public static void main(String[] args){

        Stack s = new Stack(1);

        System.out.println("Inserisco 1");
        s.push(1);
        System.out.println("Inserisco 7");
        s.push(7);

        System.out.println("Estraggo un elemento: "+s.pop());
        System.out.println("Estraggo un elemento: "+s.pop());
        System.out.println("Estraggo un elemento: "+s.pop());
        System.out.println("Estraggo un elemento: "+s.pop());

        SafeStack safeStack = new SafeStack(1);

        System.out.println("Inserisco 1");
        safeStack.safePush(1);
        System.out.println("Inserisco 7");
        safeStack.safePush(7);


    }



}
