/*
 * multsumsuc.java by Martin Lumpickas
 */

import java.util.Scanner;

public class multsumsuc{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner
        
        System.out.println("Introduiu 2 enters per separat per multiplicar:"); //print to console
        int userInput1 = reader.nextInt(); //read user input
        int userInput2 = reader.nextInt(); //read user input
        int result = 0;

        for (int i = 0; i < userInput2; i++){
            result += userInput1; //add first var to result
        }

        System.out.println("El resultat de la muliplicacio de " + userInput1 + " i " + userInput2 + " es: " + result); //print to console

        reader.close(); //close Scanner to prevent leaks
    }
}