/*
 * prova201022.java by Martin Lumpickas
 */

import java.util.Random;
import java.util.Scanner;

public class prova201022{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner
        Random randomizer = new Random(); //declare Random

        System.out.print("Introduiu el numero de preguntes: "); //print to console
        int userInput = reader.nextInt(); //read user input

        int encerts = 0;
        int i = 0;
        int errors = 0;

        while(userInput > i && errors < 3){
            i++;
            int first = randomizer.nextInt(100);
            int second = randomizer.nextInt(100);
            int x, y;
            if(first < second){
                x = second;
                y = first;
            } else {
                x = first;
                y = second;
            }
            long inici = System.currentTimeMillis();
            System.out.print(x + " - " + y + " = "); //print to console
            int result = reader.nextInt(); //read user input
            long fi = System.currentTimeMillis();
            if(result == x - y){
                if(fi - inici < 5000){ //check time
                    encerts++; //add 1 to encerts
                    System.out.println("Correcte, tens " + encerts + " encert/s"); //print to console
                } else {
                    errors++;
                    System.out.println("Correcte, pero has esgotat el temps. Tens " + errors + " error/s"); //print to console
                }
            } else {
                errors++;
                System.out.println("Incorrecte, tens " + errors + " error/s"); //print to console
            }
        }

        if(errors == 0){
            System.out.println("Enhorabona, has encertat totes les restes!"); //print to console
        } else if(errors < 3){
            System.out.println("Has encertat " + encerts + " restes de " + userInput); //print to console
        } else {
            System.out.println("Tens masses errors, has de millorar pel seguent cop!"); //print to console
        }

        reader.close(); //close Scanner to prevent leaks
    }
}