package it.polimi.ingsw.day5;

public class AdminResponsability extends Responsability {


    public AdminResponsability(Employee e, String office) {
        super(e, office);
    }

    @Override
    protected String getResponsabilityDescription() {
        return "admin";
    }
}
