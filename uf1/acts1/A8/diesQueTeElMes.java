/*
 * diesQueTeElMes.java by Martin Lumpickas
 */

import java.time.YearMonth;
import java.util.Scanner;

public class diesQueTeElMes {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner
        int userYear; //declare needed vars
        int userMonth;

        System.out.print("Introduiu l'any: "); //request user input
        userYear = reader.nextInt(); //read user input

        System.out.print("Introduiu el numero del mes: "); //request user input
        userMonth = reader.nextInt(); //read user input

        while(userMonth < 1 || userMonth > 12){ //check for incorrect values
            System.out.print("Torna a introduir el mes: ");
            userMonth = reader.nextInt();
        }

        YearMonth yearMonthObject = YearMonth.of(userYear, userMonth); //get month object from year
        int daysInMonth = yearMonthObject.lengthOfMonth(); //get days count from month object

        System.out.println("Aquest mes te " + daysInMonth + " dies"); //return result

        reader.close(); //prevent Scanner leaks
    }
}
