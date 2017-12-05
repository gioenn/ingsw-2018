package it.polimi.ingsw.day5;

public class Engineer implements Employee {

    private String name;

    public Engineer(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getOffice() {
        return null;
    }

    @Override
    public String getDescription() {
        return "Ing. "+ getName();
    }


    public static void main(String[] args){

        Employee e = new Engineer("Andrea");

        e = new ProjectManagerResponsability(e, "1a");

        e = new ProjectManagerResponsability(e, "2c");

        e = new AdminResponsability(e, "2c");

        System.out.println(e.getDescription());

    }
}
