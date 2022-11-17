/*
 * ppt.java by Martin Lumpickas
 */

import java.util.Random;
import java.util.Scanner;

public class ppt{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner
        Random randomizer = new Random(); //declare Randomizer

        System.out.print("Entra pedra, paper o tisora: "); //requst user input
        String userInput = reader.next().toLowerCase(); //read user input

        int random = randomizer.nextInt(2); //generate random number
        int user;

        switch(userInput){ //check user input
            case "pedra":
                user = 0;
                break;
            case "paper":
                user = 1;
                break;
            default:
                user = 2;
                break;
        }

        if (random == user){ //compare results
            if (random == 0){
                System.out.println("Ordinador ha tret: pedra");
            } else if (random == 1){
                System.out.println("Ordinador ha tret: paper");
            } else {
                System.out.println("Ordinador ha tret: tisora");
            }
            System.out.println("Heu empatat");
        } else if (random == 0){
            System.out.println("Ordinador ha tret: pedra");
            if (user == 1){
                System.out.println("Has guanyat");
            } else {
                System.out.println("Has perdut");
            }
        } else if (random == 1){
            System.out.println("Ordinador ha tret: paper");
            if (user == 2){
                System.out.println("Has guanyat");
            } else {
                System.out.println("Has perdut");
            }
        } else {
            System.out.println("Ordinador ha tret: tisora");
            if (user == 0){
                System.out.println("Has guanyat");
            } else {
                System.out.println("Has perdut");
            }
        }

        reader.close(); //close Scannner to avoid leaks
    }
}