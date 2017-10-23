package it.polimi.ingsw.day2;

import java.util.Date;

public class Person implements Comparable {

    private String name, surname;
    private Date birthday;

    public Person(String name, String surname, Date birthday) {

        if (name == null || surname == null || birthday == null){
            throw new IllegalArgumentException();
        }

        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Person)){
            return 0;
        }

        Person p = (Person) o;

        if(surname.compareTo(p.surname) > 0 ||
                (surname.compareTo(p.surname) == 0
                        && name.compareTo(p.name) > 0))
            return 1;
        else if (this.surname.compareTo(surname) == 0 &&
                name.compareTo(p.name) == 0)
            return 0;
        else
            return -1;

    }
}
