/*
 * bloqueig.java by Martin Lumpickas
 */

import java.util.Scanner;

public class bloqueig{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner

        String login = "sdw";
        String password = "123654!.!";
        boolean unlocked = false;

        System.out.println("Benvingut, " + login); //print to console

        int i = 0;

        while(unlocked != true){
            if(i == 3){
                System.out.println("Usuari bloquejat"); //print to console
                break;
            }
            System.out.print("Introduiu la contrasenya: "); //print to console
            String userPass = reader.nextLine(); //read user input

            if(!userPass.equals(password)){
                i++;
                System.out.println("Incorrecte, intents restants: " + (3 - i)); //print to console
            } else {
                System.out.println("Correcte"); //print to console
                break;
            }
        }

        reader.close(); //close Scanner to prevent leaks
    }
}