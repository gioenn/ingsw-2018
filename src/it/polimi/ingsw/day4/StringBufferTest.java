package it.polimi.ingsw.day4;

public class StringBufferTest {

    public static void main(String[] args){

        int numChar = 250000;

        String s1 = "";

        System.out.println("Costruisco una stringa della classe String");

        long b = System.currentTimeMillis();

        for(int i = 0; i < numChar; i++){
            s1 += 'a';
        }

        long e = System.currentTimeMillis();

        System.out.println("Tempo con String: "+(e-b));

        StringBuffer s2 = new StringBuffer();

        System.out.println("Costruisco una stringa della classe StringBuffer");

        b = System.currentTimeMillis();

        for(int i = 0; i < numChar; i++){
            s2.append('a');
        }

        e = System.currentTimeMillis();

        System.out.println("Tempo con StringBuffer: "+(e-b));







    }

}
