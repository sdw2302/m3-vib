/*
 * endevinat.java by Martin Lumpickas
 */

import java.util.Random;
import java.util.Scanner;

public class endevinat{
    public static void main(String[] args) {
        Random randomizer = new Random(); //declare Randomizer
        Scanner reader = new Scanner(System.in); //declare Scanner
        System.out.print("Endevina el numero del 1 al 10: "); //request user input
        int userInput = reader.nextInt(); //read user input
        int toBeGuessed = randomizer.nextInt(10) + 1; //generate random number from 1 to 10
        while (userInput > 10 || userInput < 1){ //check user input
            System.out.println("Valor incorrecte, torna a escriure:");
            userInput = reader.nextInt();
        }
        if (userInput == toBeGuessed){ //check if guessed
            System.out.println("Felicitats! Has endevinat el numero " + toBeGuessed);
        } else {
            System.out.println("Ho sento, el numero era el " + toBeGuessed);
        }
    }
}