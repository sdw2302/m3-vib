/*
 * carcre.java by Martin Lumpickas
 */

import java.util.Random;

public class carcre{
    public static void main(String[] args) {
        Random randomizer = new Random(); //declare Random

        int cares = 0, creus = 0;

        for(int i = 0; i < 100; i++){
            int random = randomizer.nextInt(100); //generate random number
            if (random < 50){
                cares++; //add 1
            } else {
                creus++; //add 1
            }
        }

        System.out.println("Cares: " + cares + "\nCreus: " + creus); //print to console
    }
}