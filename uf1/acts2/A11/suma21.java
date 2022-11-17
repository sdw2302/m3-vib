/*
 * suma21.java by Martin Lumpickas
 */

import java.util.Scanner;

public class suma21{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner
        int sum = 0;

        while (sum <= 21) {
            System.out.print("Introduiu un numero entre 1 i 5: "); //print to console
            int userInput = reader.nextInt(); //read user input
            
            if (userInput < 1 | userInput > 5){
                System.out.println("Valor incorrecte"); //print to console
            } else {
                sum += userInput; //add number to sum
            }

            if (sum > 21){
                System.out.println("Suma actual: " + sum + ", ultim numero introduit: " + userInput + ", mes de 21"); //print to console
            }
        }

        reader.close(); //close Scanner to prevent leaks
    }
}