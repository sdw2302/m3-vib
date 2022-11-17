/*
 * setimig.java by Martin Lumpickas
 */

import java.util.Random;
import java.util.Scanner;

public class setimig{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner
        Random randomizer = new Random(); //declare Random

        System.out.print("Introduiu l'aposta: "); //print to console
        int userBet = reader.nextInt(); //read user input

        int nextCard;
        String card;
        boolean userStop = false;
        double userScore = 0;

        while(!userStop && userScore < 7.5){
            nextCard = randomizer.nextInt(10) + 1;
            card = "";
            switch(nextCard) {
                case 8:
                    card = "sota";
                    break;
                case 9:
                    card = "cavall";
                    break;
                case 10:
                    card = "rei";
                    break;
                default:
                    card += nextCard;
                    break;
            }

            if(nextCard == 8 || nextCard == 9 || nextCard == 10){
                userScore += 0.5;
            } else {
                userScore += nextCard;
            }

            System.out.println("Has tret un/a " + card); //print to console

            if(userScore < 7.5){
                System.out.print("Vols continuar? (Y/n)"); //print to console
                char userAns = reader.next().charAt(0); //read user input
    
                if(userAns == 'n' || userAns == 'N'){
                    userStop = true;
                    System.out.println("No has perdut cap euro"); //print to console
                }
            } else if(userScore == 7.5){
                System.out.println("Has guanyat " + userBet*2 + " euros!"); //print to console
            } else {
                System.out.println("Has perdut!"); //print to console
            }
        }

        reader.close(); //close Scanner to prevent leaks
    }
}