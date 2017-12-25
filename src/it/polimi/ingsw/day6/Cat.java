package it.polimi.ingsw.day6;

public class Cat extends Pet {

    @Override
    protected Pet clonePet() {
        return new Cat();
    }
}
