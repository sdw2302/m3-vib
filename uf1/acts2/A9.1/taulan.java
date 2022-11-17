/*
 * taulan.java by Martin Lumpickas
 */

import java.util.Scanner;

public class taulan {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner

        System.out.print("Introduiu el numero a partir del qual voleu la taula de multiplicacions: "); //print to console
        int userInput = reader.nextInt(); //read user input

        for (int i = 1; i <= 10; i++){
            String toBePrinted = userInput + " x " + i + " = " + (userInput*i); //calc the current number using i
            System.out.println(toBePrinted); //print to console
        }

        reader.close(); //close Scanner to prevent leaks
    }
}
