package it.polimi.ingsw.day6;

import java.util.ArrayList;
import java.util.List;

public abstract class PetSchool {

    private List<Pet> pets;

    private final int N = 50;

    public PetSchool(/*String petType*/){


        pets = new ArrayList<>(N);

        for (int i = 0; i < N; i++){
            pets.add(createPetStudent());
        }

        /* Antipattern

        pets = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {

            if (petType.equals("dog")) {
                pets.add(new Dog());
            }
            else if(petType.equals("cat")){
                pets.add(new Cat());
            }
            // ...
        }
        */



    }

    abstract protected Pet createPetStudent();


}
