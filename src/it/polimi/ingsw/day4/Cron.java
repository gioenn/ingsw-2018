package it.polimi.ingsw.day4;

import java.util.Calendar;
import java.util.Date;

public class Cron {

    private final int numberOfActions = 10;

    private Action[] todo = new Action[numberOfActions];
    private boolean[] done = new boolean[numberOfActions];

    public Cron(){
        for (int i = 0; i < numberOfActions; i++){
            done[i] = false;
        }
    }

    public void addAction(Action action){
        for (int i = 0; i < numberOfActions; i++){
            if (todo[i] == null){
                todo[i] = action;
                done[i] = false;
                break;
            }
        }
    }

    public void start(){

        int i = 0;
        boolean ended = false;

        do {
            Date now = new Date();

            Action action = todo[i];

            if(action != null && now.after(action.getWhen()) && !done[i]){
                action.getWhat().execute();
                done[i] = true;
            }

            if (i == numberOfActions - 1)
                i = 0;
            else
                i++;

            ended = true;

            for (int k = 0; k < numberOfActions; k++){
                if (todo[k] != null && !done[k]){
                    ended = false;
                    break;
                }
            }


        } while (!ended);

    }


    public static void main(String[] args){

        Calendar c = Calendar.getInstance();
        c.setTime(new Date());

        Date d1 = c.getTime();

        c.add(Calendar.SECOND, 2);

        Date d2 = c.getTime();

        c.add(Calendar.SECOND, 2);

        Date d3 = c.getTime();

        Cron cron = new Cron();

        cron.addAction(new Action(d1, new SimpleAction("Action 1")));

        cron.addAction(new Action(d2, new SimpleAction("Action 2")));

        cron.addAction(new Action(d3, new Actionable() {
            @Override
            public void execute() {
                System.out.println("Anonymous Action 3");
            }
        }));

        cron.start();

    }


}
