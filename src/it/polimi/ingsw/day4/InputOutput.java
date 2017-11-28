package it.polimi.ingsw.day4;

import java.util.Scanner;

public class InputOutput {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero ripetizioni: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.println("Inserire una frase: ");
            String st = scanner.nextLine();
            System.out.println("Inserire una sottostringa da cercare: ");
            String word = scanner.nextLine();

            System.out.println("Il numero di occorrenze trovate è: "
                    + countOccurences(st, word));
        }



    }

    private static int countOccurences(String st, String word){

        int sum = 0, i = 0, x = 0;

        do {
            x = st.indexOf(word, i);
            if (x != -1)
                sum++;
            i = x+1;

        } while(x!=-1);

        return sum;

    }

}
