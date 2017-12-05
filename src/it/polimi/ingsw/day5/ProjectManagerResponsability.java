package it.polimi.ingsw.day5;

public class ProjectManagerResponsability extends Responsability {


    public ProjectManagerResponsability(Employee e, String office) {
        super(e, office);
    }

    @Override
    protected String getResponsabilityDescription() {
        return "project manager";
    }
}
