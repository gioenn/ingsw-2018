package it.polimi.ingsw.day2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends Person implements Comparable {

    private String id;
    private ArrayList<Grade> grades;

    public Student(String name, String surname,
                   Date birthday, String id) {
        super(name, surname, birthday);
        this.id = id;
        grades = new ArrayList<>();
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public boolean canGraduate(){
        return getTotalCredits() >= 180;
    }

    public int getTotalCredits(){
        int credits = 0;

        /*
        for (int i = 0; i < grades.size(); i++){
            Grade g = grades.get(i);
        }
        */

        for (Grade g : grades){
            credits += g.getCredits();
        }

        return  credits;
    }

    public double getWeightedGradeAverage(){
        double avg = 0;

        for (Grade g : grades){
            avg += g.getPoints()*g.getCredits();
        }

        return avg/getTotalCredits();
    }

    public int compareTo(Object o){
        int i = super.compareTo(o);

        if(i != 0)
            return i;

        if(o instanceof Student){
            Student s = (Student) o;
            return id.compareTo(s.id);
        }

        return 0;
    }

    public String toString(){
        return "surname: "+getSurname()+" name: "+getName()+ " id: "+id;
    }
}
