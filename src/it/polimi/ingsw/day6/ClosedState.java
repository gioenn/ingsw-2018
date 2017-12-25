package it.polimi.ingsw.day6;

public class ClosedState extends DoorState {

    public ClosedState(Door d) {
        super(d);
    }


    @Override
    public void touch() {
        door.setState(new OpeningState(door));
    }

}
