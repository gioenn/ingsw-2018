package it.polimi.ingsw.day1;

/**
 * Created by giovanniquattrocchi on 09/10/17.
 */
public class Stack {

    protected int data[];
    protected int current;

    public Stack(int size){
        data = new int[size];
        current = 0;
    }

    public Stack(){
        this(10);
    }

    public void push(int n){
        if (current < data.length){
            data[current] = n;
            current++;
        }
    }

    public int pop(){

        if (current > 0){
            current--;
            return data[current];
        }

        return -999999;
    }

    public static void main(String[] args){

        Stack s = new Stack();

        s.push(3);
        s.push(5);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }

}
