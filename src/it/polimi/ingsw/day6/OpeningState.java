package it.polimi.ingsw.day6;

public class OpeningState extends DoorState {

    public OpeningState(Door d) {
        super(d);
    }

    @Override
    public void complete() {
        door.setState(new OpenState(door));
    }

    @Override
    public void touch() {
        door.setState(new ClosingState(door));
    }

    @Override
    public void timeout() {

    }
}
