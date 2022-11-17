/*
 * pes.java by Martin Lumpickas
 */

import java.util.Random;

public class pes {
    public static void main(String[] args) {
        Random randomizer = new Random(); //declare Random
        int[] weights = new int[100];

        for(int i = 0; i < 100; i++){
            weights[i] = randomizer.nextInt(21) + 30;
        }

        for(int i = 30; i <= 50; i++){
            System.out.print(i + "\t"); //print to console
            for(int j = 0; j < weights.length; j++){
                if(weights[j] == i){
                    System.out.print("█"); //print to console
                }
            }
            System.out.print("\n"); //print to console
        }
    }
}
