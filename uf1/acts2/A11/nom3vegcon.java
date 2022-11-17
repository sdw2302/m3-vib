/*
 * nom3vegcon.java by Martin Lumpickas
 */

import java.util.Scanner;

public class nom3vegcon {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner

        System.out.print("Introduiu una serie de numeros: "); //print to console
        String userString = reader.next(); //read user input

        char checking = userString.charAt(0);
        int i = 0;
        int reps = 1;

        while(i < userString.length() - 1){
            i++;
            if(checking == userString.charAt(i)){
                reps++;
                if(reps == 3){
                    System.out.println("El numero " + checking + " es el primer que es repeteix 3 vegades consecutives"); //print to console
                    break; //stop while loop
                }
            } else if(i == userString.length() - 1){
                System.out.println("No s'ha trobat cap numero que es repeteix 3 vegades consecutives"); //print to console
                break; //stop while loop
            } else {
                checking = userString.charAt(i); //if number changes, set to current
                reps = 1;
            }
        }

        reader.close(); //close Scanner to prevent leaks
    }
}
