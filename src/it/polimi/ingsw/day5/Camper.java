package it.polimi.ingsw.day5;

public class Camper implements Runnable {

    private Pot pot;
    private String name;

    public Camper(Pot p, String name){
        pot = p;
        this.name = name;
    }

    @Override
    public void run() {
        while(true){
            pot.getPart(name);
        }
    }
}
