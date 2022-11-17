/*
 * posnegfinzero.java by Martin Lumpickas
 */

import java.util.Scanner;

public class posnegfinzero {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner

        boolean isZero = false; //set to false by default for while
        
        while (isZero == false){ //do while userInput is not zero
            System.out.print("Introduiu un numero: "); //print to console
            int userInput = reader.nextInt(); //read user input
            if (userInput > 0){
                System.out.println("Es positiu"); //print to console
            } else if (userInput < 0){
                System.out.println("Es negatiu"); //print to console
            } else {
                System.out.println("Adeu!"); //print to console
                isZero = true; //end while if zero
            }
        }
        reader.close(); //close Scanner to prevent leaks
    }
}
