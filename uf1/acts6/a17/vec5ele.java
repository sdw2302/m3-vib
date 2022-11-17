/*
 * vec5ele.java by Martin Lumpickas
 */

import java.util.Random;

public class vec5ele{
    public static void main(String[] args) {
        Random randomizer = new Random(); //declare Random
        int[] vector = new int[5];
        int min = 0, max = 0, sum = 0, mid = 0;
        
        System.out.print("El contingut de la llista: "); //print to console
        for(int i = 0; i < vector.length; i++){
            int generated = randomizer.nextInt(10) + 1;
            vector[i] = generated;
            if(i < vector.length - 1){
                System.out.print(vector[i] + ", "); //print to console
            } else {
                System.out.println(vector[i]); //print to console;
            }
            sum += generated;
            if(min == 0){
                min = generated;
            }
            if(max < generated){
                max = generated;
            } else if(min > generated){
                min = generated;
            }
        }

        System.out.println("Suma dels numeros de la llista: " + sum); //print to console

        mid = vector[vector.length/2];

        System.out.println("El numero major es: " + max + ", el numero menor es " + min + ", i el numero del mig es: " + mid); //print to console
        
    }
}