package it.polimi.ingsw.day6;

public class DogSchool extends PetSchool{

    @Override
    protected Pet createPetStudent() {
        return new Dog();
    }


    public static void main(String[] args){
        PetSchool ps = new DogSchool();
    }


}



