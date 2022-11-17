/*
 * aleatori50.java by Martin Lumpickas
 */

import java.util.Random;

public class aleatori50 {
    public static void main(String[] args) {
        Random randomizer = new Random(); //declare Random

        int ctr = 0; //initialize counter
        while (ctr < 50){ //do while counter is less than 50
            ctr++;
            int random = randomizer.nextInt(15) + 1;
            System.out.println(random); //print to console
        }
    }
}
