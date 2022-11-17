/*
 * posnegzer.java by Martin Lumpickas
 */

import java.util.Scanner;

public class posnegzer {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner
        for (int ctr = 0; ctr < 8; ctr++){ //for cycle
            System.out.print("Introduiu el numero " + (ctr + 1) + ": "); //print to console
            int userInput = reader.nextInt(); //read user input
            if (userInput > 0){
                System.out.println("es positiu"); //print to console
            } else if (userInput < 0){
                System.out.println("es negatiu"); //print to console
            } else {
                System.out.println("es zero"); //print to console
            }
        }
        reader.close(); //close Scanner to prevent leaks
    }
}
