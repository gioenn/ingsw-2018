package it.polimi.ingsw.day6;

import java.util.ArrayList;
import java.util.List;

public class PetSchoolWithPrototype {

    private List<Pet> pets;
    private final int N = 50;

    public PetSchoolWithPrototype(Pet prototype){
        pets = new ArrayList<>(N);

        for (int i = 0; i < N; i++){
            pets.add(prototype.clonePet());
        }
    }


    public static void main(String[] args){
        PetSchoolWithPrototype ps =
                new PetSchoolWithPrototype(new Dog());

        ps = new PetSchoolWithPrototype(new Cat());
    }

}
