/*
 * endevinatlimitat.java by Martin Lumpickas
 */

import java.util.Random;
import java.util.Scanner;

public class endevinatlimitat {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner
        Random randomizer = new Random(); //declare Random

        int random = randomizer.nextInt(100) + 1;
        int tries = 10;
        int triesLeft = tries;

        boolean found = false;

        System.out.println("Endevina un numero entre 1 i 100"); //print to console

        while(triesLeft > 0 && found == false){
            System.out.print("Tens " + triesLeft + " intent/s, introdueix la teva resposta: "); //print to console
            int userInput = reader.nextInt(); //read user input

            if(userInput > random){
                System.out.println("El numero que busques es mes petit"); //print to console
                triesLeft--;
            } else if(userInput < random){
                System.out.println("El numero que busques es mes gran"); //print to console
                triesLeft--;
            } else {
                System.out.println("L'has encertat en " + triesLeft + " intent/s"); //print to console
                found = true;
            }

            if(triesLeft == 0){
                System.out.println("S'han acabat els intents!"); //print to console
            }
        }

        reader.close(); //close Scanner to prevent leaks
    }
}
