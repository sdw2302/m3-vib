/*
 * del1aln.java by Martin Lumpickas
 */

import java.util.Scanner;

public class del1aln {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner
        System.out.print("Introduiu un numero: "); //request user input
        int userInput = reader.nextInt(); //read user input
        int ctr = 0; //declare empty counter
        while (ctr < userInput){ //count
            ctr++;
            System.out.println(ctr);
        }
        reader.close(); //close Scanner to prevent leaks
    }
}