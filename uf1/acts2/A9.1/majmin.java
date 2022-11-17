/*
 * majmin.java by Martin Lumpickas
 */

import java.util.Scanner;

public class majmin {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner

        System.out.print("Escriviu una serie de caracters i identificare caracter per caracter si es majuscula o minuscula: "); //print to console
        String userInput = reader.next(); //read user input

        for (int i = 0; i < userInput.length(); i++){
            if (userInput.charAt(i) == userInput.toLowerCase().charAt(i)){ //check if lower case
                System.out.println("El primer caracter (" + userInput.charAt(i) + "), es una minuscula"); //print to console
            } else {
                System.out.println("El primer caracter (" + userInput.charAt(i) + "), es una majuscula"); //print to console
            }
        }

        reader.close(); //close Scanner to prevent leaks
    }
}
