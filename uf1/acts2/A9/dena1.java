/*
 * dena1.java by Martin Lumpickas
 */

import java.util.Scanner;

public class dena1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner
        System.out.print("Introduiu un numero: "); //request user input
        int userInput = reader.nextInt(); //read user input
        while (userInput > 0){ //count
            System.out.println(userInput);
            userInput--;
        }
        reader.close(); //close Scanner to prevent leaks
    }
}
