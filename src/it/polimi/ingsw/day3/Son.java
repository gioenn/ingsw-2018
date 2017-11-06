package it.polimi.ingsw.day3;

public class Son extends Father {

    public Son(){
        super("...");
        System.out.println("Son");
    }

    public static void main(String[] args){
        new Son();
    }

}
