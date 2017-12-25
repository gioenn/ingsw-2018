package it.polimi.ingsw.day6;

public abstract class DoorState implements IDoor {

    protected Door door;

    public DoorState(Door d){
        door = d;
    }

    @Override
    public void complete() {

    }

    @Override
    public void touch() {

    }

    @Override
    public void timeout() {

    }
}
