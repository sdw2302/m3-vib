/*
 * dosllistespar.java by Martin Lumpickas
 */

import java.util.Random;

public class dosllistespar {
    public static void main(String[] args) {
        Random randomizer = new Random(); //declare Random
        int[] llista = new int[15], llistaPar = new int[15];

        System.out.print("Primera llista: "); //print to console

        for(int i = 0; i < llista.length; i++){
            int generated = randomizer.nextInt(51) + 50;
            llista[i] = generated;
            if(llista[i] % 2 == 0){
                for(int j = 0; j < llistaPar.length; j++){
                    if(llistaPar[j] == 0){
                        llistaPar[j] = llista[i];
                        break;
                    }
                }
            }
            if(i == llista.length - 1){
                System.out.println(llista[i]); //print to console
            } else {
                System.out.print(llista[i] + ", "); //print to console
            }
        }

        System.out.print("Llista parells: "); //print to console

        for(int i = 0; i < llistaPar.length; i++){
            if(i == llistaPar.length - 1){
                System.out.println(llistaPar[i]); //print to console
            } else if(llistaPar[i + 1] == 0) {
                System.out.println(llistaPar[i]); //print to console
                break;
            } else {
                System.out.print(llistaPar[i] + ", "); //print to console
            }
        }
    }
}
