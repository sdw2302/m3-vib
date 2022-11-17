/*
 * longitud.java by Martin Lumpickas
 */

import java.util.Scanner;

public class longitud {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner

        System.out.print("Introduiu un numero: "); //print to console
        String userString = reader.next(); //read user input

        System.out.println("El numero " + userString + " te " + userString.length() + " xifres"); //print to console

        reader.close(); //close Scanner to prevent leaks
    }
}
