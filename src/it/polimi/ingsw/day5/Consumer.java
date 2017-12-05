package it.polimi.ingsw.day5;

public class Consumer implements Runnable {

    private Account account;
    private final int time, max;

    public Consumer(Account a, int time, int max){
        account = a;
        this.time = time;
        this.max = max;
    }

    @Override
    public void run(){
        while(true){
            int amount = (int) (Math.random()*max);
            if (account.collect(amount)) {
                System.out.println("Ho prelevato " + amount+" ");
            }
            else {
                System.out.println("Fondi insufficienti");
            }
            try {
                Thread.sleep(time*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Errore");
            }

        }
    }
}
