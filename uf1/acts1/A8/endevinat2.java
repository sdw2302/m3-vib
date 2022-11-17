/*
 * endevinat2.java by Martin Lumpickas
 */

import java.util.Random;
import java.util.Scanner;

public class endevinat2{
    public static void main(String[] args) {
        Random randomizer = new Random(); //declare Randomizer
        Scanner reader = new Scanner(System.in); //declare Scanner
        System.out.print("Entra valor incial: "); //request user input
        int start = reader.nextInt(); //read user input
        System.out.print("Entra valor final: "); //request user input
        int end = reader.nextInt(); //read user input
        while (end < start){
            System.out.print("");
        }
        System.out.print("Endevina el numero: "); //request user input
        int userInput = reader.nextInt(); //read user input
        int range = end - start + 1; //calculate random range
        int toBeGuessed = randomizer.nextInt(range) + start; //generate random number from user range
        while (userInput < start || userInput > end){
            System.out.print("Valor incorrecte, torna a introduir el numero: ");
            userInput = reader.nextInt();
        }
        if (userInput == toBeGuessed){ //check if guessed
            System.out.println("Felicitats! Has endevinat el numero " + toBeGuessed);
        } else {
            System.out.println("Ho sento, el numero era el " + toBeGuessed);
        }
        reader.close();
    }
}