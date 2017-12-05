package it.polimi.ingsw.day5;

public class Producer implements Runnable {

    private Account account;
    private final int time, max;

    public Producer(Account a, int time, int max){
        account = a;
        this.time = time;
        this.max = max;
    }

    @Override
    public void run(){
        while(true){
            int amount = (int) (Math.random()*max);
            account.deposit(amount);
            System.out.println("Ho depositato "+amount);
            try {
                Thread.sleep(time*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Errore");
            }

        }
    }
}
