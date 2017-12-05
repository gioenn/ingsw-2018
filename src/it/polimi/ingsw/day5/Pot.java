package it.polimi.ingsw.day5;

public class Pot {

    private final int P = 40;
    private int parts = P;

    public synchronized void getPart(String name){
        while(parts <= 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        parts--;
        notifyAll();
        System.out.println(name+" ha ottenuto una porzione: rimanenti "+parts);
    }

    public synchronized void fill(){
        while(parts > 0){
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        parts = P;
        System.out.println("Pentola rimpieta con "+parts+" porzioni");
        notifyAll();
    }


    public static void main(String[] args){

        Pot pot = new Pot();

        new Thread(new Chef(pot)).start();

        new Thread(new Camper(pot, "A")).start();
        new Thread(new Camper(pot, "B")).start();
        new Thread(new Camper(pot, "C")).start();


    }



}
