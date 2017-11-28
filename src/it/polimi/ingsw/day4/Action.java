package it.polimi.ingsw.day4;

import java.util.Date;

public class Action {

    private Date when;
    private Actionable what;

    public Action(Date when, Actionable what){
        this.when = when;
        this.what = what;
    }

    public Date getWhen() {
        return when;
    }

    public Actionable getWhat(){
        return what;
    }

}
