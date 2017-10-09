package it.polimi.ingsw.day1;

/**
 * Created by giovanniquattrocchi on 09/10/17.
 */
public class Set {

    int[] numbers;
    int currentSize;

    public Set(int size){
        currentSize = 0;
        numbers = new int[size];
    }


    /*
    public Set(){
        currentSize = 0;
        numbers = new int[100];
    }
    */

    public Set(){
        this(100);
    }

    public boolean isMember(int n){

        int i = 0;

        while (i < currentSize){
            if (numbers[i] == n){
                return true;
            }
            i++;
        }

        return false;
    }

    public void addMember(int n){
        if (currentSize == numbers.length)
            return;
        if (isMember(n))
            return;

        numbers[currentSize] = n;
        currentSize++;
    }

    public void deleteMember(int n){

        int i = 0;

        while (i < currentSize){
            if (numbers[i] == n){
                currentSize--;
                while (i < currentSize){
                    numbers[i] = numbers[i+1];
                    i++;
                }
                return;
            }
            i++;
        }
    }

    public void showSet(){

        int i = 0;
        boolean first = true;

        String s = "{";

        while (i < currentSize){
            if (first)
                first = false;
            else
                s+= " , ";

            s += numbers[i];

            i++;
        }

        s+="}";

        System.out.println(s);

    }

    public static void main(String[] args){

        Set s = new Set(10);

        s.addMember(1);
        s.addMember(7);
        s.addMember(9);
        s.addMember(11);

        s.showSet();

        s.deleteMember(7);

        s.showSet();

    }


}
