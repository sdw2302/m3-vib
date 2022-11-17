/*
 * monedes.java by Martin Lumpickas
 */

import java.util.Scanner;

public class monedes{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner
        int userInput; //declare all needed vars
        int twoEur = 0;
        int oneEur = 0;
        int fiftyCt = 0;
        int twentyCt = 0;
        int tenCt = 0;
        int fiveCt = 0;
        int twoCt = 0;
        int oneCt = 0;
        String tbReturned = "";

        System.out.print("Introduiu les monedes: "); //request user input
        userInput = reader.nextInt(); //read user input

        if (userInput >= 0){ //check user input
            while(userInput >= 200){ //count possible 2eur combinations
                userInput -= 200;
                twoEur++;
            }
            if (twoEur == 1){ //add values to String
                tbReturned += "1 moneda de 2 Euros\n";
            } else if (twoEur > 1){
                tbReturned += twoEur + " monedes de 2 Euros\n";
            }
            while(userInput >= 100){ //count possible 1eur combinations
                userInput -= 100;
                oneEur++;
            }
            if (oneEur == 1){ //add values to String
                tbReturned += "1 moneda de 1 Euro\n";
            } else if (oneEur > 1){
                tbReturned += oneEur + " monedes de 1 Euro\n";
            }
            while(userInput >= 50){ //count possible 50cts combinations
                userInput -= 50;
                fiftyCt++;
            }
            if (fiftyCt == 1){ //add values to String
                tbReturned += "1 moneda de 50 centims\n";
            } else if (fiftyCt > 1){
                tbReturned += fiftyCt + " monedes de 50 centims\n";
            }
            while(userInput >= 20){ //count possible 20cts combinations
                userInput -= 20;
                twentyCt++;
            }
            if (twentyCt == 1){ //add values to String
                tbReturned += "1 moneda de 20 centims\n";
            } else if (twentyCt > 1){
                tbReturned += twentyCt + " monedes de 20 centims\n";
            }
            while(userInput >= 10){ //count possible 10cts combinations
                userInput -= 10;
                tenCt++;
            }
            if (tenCt == 1){ //add values to String
                tbReturned += "1 moneda de 10 centims\n";
            } else if (tenCt > 1){
                tbReturned += tenCt + " monedes de 10 centims\n";
            }
            while(userInput >= 5){ //count possible 5cts combinations
                userInput -= 5;
                fiveCt++;
            }
            if (fiveCt == 1){ //add values to String
                tbReturned += "1 moneda de 5 centims\n";
            } else if (fiveCt > 1){
                tbReturned += fiveCt + " monedes de 5 centims\n";
            }
            while(userInput >= 2){ //count possible 2cts combinations
                userInput -= 2;
                twoCt++;
            }
            if (twoCt == 1){ //add values to String
                tbReturned += "1 moneda de 2 centims\n";
            } else if (twoCt > 1){
                tbReturned += twoCt + " monedes de 2 centims\n";
            }
            while(userInput >= 1){ //count possible 1cts combinations
                userInput -= 1;
                oneCt++;
            }
            if (oneCt == 1){ //add values to String
                tbReturned += "1 moneda de 1 centim\n";
            }
            System.out.println(tbReturned);
        } else {
            System.out.println("Valor incorrecte");
        }
    reader.close(); //close Scanner to prevent leaks
    }
}