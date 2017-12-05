package it.polimi.ingsw.day5;

public abstract class Responsability implements Employee {

    private Employee decorated;
    private String office;

    public Responsability(Employee e, String office){
        decorated = e;
        this.office = office;
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getOffice() {
        return office;
    }

    @Override
    public String getDescription() {
        return decorated.getDescription()+", "+getResponsabilityDescription()
                +" area: "+getOffice();
    }

    abstract protected String getResponsabilityDescription();

}
