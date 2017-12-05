package it.polimi.ingsw.day5;

public class Chef implements Runnable{

    private Pot pot;

    public Chef(Pot p){
        pot = p;
    }


    @Override
    public void run() {
        while(true){
            pot.fill();
        }
    }
}
