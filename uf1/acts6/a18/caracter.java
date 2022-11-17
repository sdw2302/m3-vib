/*
* caracter.java by Martin Lumpickas
*/

import java.util.Scanner;

public class caracter{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner

        System.out.print("Introduiu un text: "); //print to console
        String userText = reader.nextLine(); //read user input

        System.out.print("Introduiu el caracter que voleu trobar: "); //print to console
        char userChar = reader.next().charAt(0); //read user input

        int[] pos = new int[userText.length()];
        int lstPos = 0;

        for(int i = 0; i < userText.length(); i++){
            if(userText.charAt(i) == userChar){
                pos[lstPos] = i;
                lstPos++;
            }
        }

        System.out.print("El caracter es troba en les posicions: "); //print to console

        for(int i = 0; i < pos.length; i++){
            if(i > 0 && pos[i] == 0){
                break;
            } else {
                System.out.print(pos[i] + " "); //print to console
            }
        }

        System.out.print('\n'); //print to console

        reader.close(); //close Scanner to prevent leaks
    }
}