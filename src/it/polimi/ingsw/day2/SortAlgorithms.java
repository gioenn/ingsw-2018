package it.polimi.ingsw.day2;

import java.util.Arrays;
import java.util.Date;

public class SortAlgorithms {

    public static void sort(Comparable[] data, boolean ascending){
        int modifier = ascending ? 1 : -1;

        for(int i =0; i < data.length; i++)
            for(int j=i+1; j < data.length; j++){
                if (modifier*data[i].compareTo(data[j]) > 0){
                    Comparable tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
    }

    public static void main(String[] args){

        Date date = new Date();

        Student s1 = new Student("AAA",
                "AAA", date, "0");
        Student s2 = new Student("BBB",
                "AAA", date, "1");
        Student s3 = new Student("BBB",
                "AAA", date, "2");

        Student[] students = {s3, s1, s2};

        SortAlgorithms.sort(students, false);

        System.out.println(Arrays.toString(students));

    }

}
