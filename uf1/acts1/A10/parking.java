/*
 * parking.java by Martin Lumpickas
 */

import java.util.Scanner;

public class parking{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner

        System.out.print("Introduiu la hora d'entrada (format: hh:mm): "); //request user input
        String userTime = reader.next(); //read user input

        int hIn = Integer.parseInt(userTime.split(":")[0]); //get hour out of time
        int mIn = Integer.parseInt(userTime.split(":")[1]); //get minutes out of time

        System.out.print("Introduiu la hora de sortida (format: hh:mm): "); //request user input
        userTime = reader.next(); //read user input

        int hOut = Integer.parseInt(userTime.split(":")[0]); //get hour out of time
        int mOut = Integer.parseInt(userTime.split(":")[1]); //get minutes out of time

        int hTotal = hOut - hIn; //calc total hours
        int mTotal = mOut - mIn + (hTotal*60); //calc total time

        double price = 0; //declare total price

        while (mTotal > 0){ //calc total price
            if(mTotal > 120){
                price += 0.050;
            } else if (mTotal > 30){
                price += 0.055;
            } else {
                price += 0.057750;
            }
            mTotal--;
        }

        double readablePrice = (double) Math.round(price * 100)/100; //remove excessive decimals
        double maxPrice = 20.95; //set max price

        if (readablePrice > maxPrice){ //check for max price
            readablePrice = maxPrice;
        }

        System.out.println("Has de pagar " + readablePrice + " Euros per el parking"); //return output

        reader.close(); //close Scanner to avoid leaks
    }
}