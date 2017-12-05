package it.polimi.ingsw.day5;

public class Plant implements Runnable {

    private enum State {
        OK, STOPPED, BUSY
    }

    private State state;
    private Valve valve;

    public Plant(){
        state = State.OK;
    }

    @Override
    public void run() {
        while(state != State.STOPPED){
            System.out.println("Sto lavorando...");
            while(Math.random() <= 0.8){
                System.out.println("Status ok");
            }

            state = State.BUSY;
            valve = new Valve();

            Thread valveThread = new Thread(valve);
            valveThread.start();

            synchronized (valve){
                try {
                    valve.wait(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (valve.getState() == Valve.State.CLOSED){
                System.out.println("Fallimento...");
                state = State.STOPPED;
            }
            else {
                System.out.println("Valvola aperta, attendo lo sfogo...");
                try {
                    valveThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }


    public static void main(String[] args){

        new Thread(new Plant()).start();

    }



}
