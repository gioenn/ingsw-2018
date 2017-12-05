package it.polimi.ingsw.day5;

public class Valve implements Runnable {

    public enum State {
        OPENED, CLOSED
    }

    private State state;

    public Valve(){
        state = State.CLOSED;
    }

    public State getState() {
        return state;
    }

    @Override
    public void run() {

        System.out.println("Aprendo la valvola...");

        long time = (long) (6000*Math.random());

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Valvola aperta dopo "+time+"ms");

        state = State.OPENED;

        synchronized (this) {
            notifyAll();
        }

        time = (long) (5000+5000*Math.random());

        System.out.println("Valvola si sfogherà per "+time+"ms");

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        state = State.CLOSED;
        System.out.println("Valvola chiusa");

    }


}
