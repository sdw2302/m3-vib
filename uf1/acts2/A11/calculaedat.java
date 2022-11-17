/*
 * calculaedat.java by Martin Lumpickas
 */

import java.util.Scanner;
import java.time.LocalDate;

public class calculaedat {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner
        int age = 0;

        LocalDate cDate = LocalDate.now();

        System.out.print("Introduiu el nom: "); //print to console
        String name = reader.next(); //read user input

        System.out.print("Introduiu la data de naixement (format dd/mm/yyyy): "); //print to console
        String birthday = reader.next(); //read user input

        int day = Integer.parseInt(birthday.split("/")[0]); //get day from birthday
        int cDay = cDate.getDayOfMonth();
        int month = Integer.parseInt(birthday.split("/")[1]); //get month from birthday
        int cMonth = cDate.getMonthValue();
        int year = Integer.parseInt(birthday.split("/")[2]); //get year from birthday
        int cYear = cDate.getYear();

        if(day > cDay){
            cMonth--;
        }
        if(month > cMonth){
            cYear--;
        }

        age = cYear - year; //calc age

        System.out.println(name + " te " + age + " anys"); //print to console

        reader.close(); //close Scanner to prevent leaks
    }
}
