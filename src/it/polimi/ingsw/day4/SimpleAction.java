package it.polimi.ingsw.day4;

public class SimpleAction implements Actionable {

    private String message;

    public SimpleAction(String message){
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(message);
    }
}
