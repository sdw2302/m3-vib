/*
 * seq.java by Martin Lumpickas
 */

import java.util.Scanner;

public class seq{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner

        System.out.print("Introduiu la longitud de la sequencia: "); //print to console
        var userInput = reader.nextInt(); //read user input

        var i = 1;
        var seq = 1;

        System.out.print("Sequencia: " + seq + ", "); //print to console

        while(i < userInput){
            if(i % 2 != 0){
                seq += 4;
            } else {
                seq -= 2;
            }

            i++;

            if (i == userInput){
                System.out.println(seq);; //print to console
            } else {
                System.out.print(seq + ", "); //print to console
            }
        }

        reader.close(); //close Scanner to prevent leaks
    }
}