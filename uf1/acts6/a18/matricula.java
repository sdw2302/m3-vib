/*
* matricula.java by Martin Lumpickas
*/

import java.util.Scanner;

public class matricula {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner

        System.out.print("Introduiu una matricula (format NNNN-LLL): "); //print to console
        String userPlate = reader.next(); //read user input

        if(userPlate.charAt(4) != '-'){
            System.out.println("Format incorrecte"); //print to console
            reader.close(); //close Scanner to prevent leaks
            return;
        }

        String plateNums = userPlate.split("-")[0];
        String plateLetters = "";
        int parsedNums = 0;
        String nums = userPlate.split("-")[1];

        try {
            parsedNums = Integer.parseInt(plateNums);
            plateLetters = userPlate.split("-")[1];
        } catch (Exception e) {
            System.out.println("Format incorrecte"); //print to console
            reader.close(); //close Scanner to prevent leaks
            return;
        }

        if(parsedNums > 10000 || nums.length() != 3){
            System.out.println("Format incorrecte"); //print to console
            reader.close(); //close Scanner to prevent leaks
            return;
        }

        if(plateLetters.length() != 3){
            System.out.println("Format incorrecte"); //print to console
            reader.close(); //close Scanner to prevent leaks
            return;
        } else {
            for(int i = 0; i < plateLetters.length(); i++){
                if(plateLetters.toUpperCase().charAt(i) == 'A' || plateLetters.toUpperCase().charAt(i) == 'E' || plateLetters.toUpperCase().charAt(i) == 'I' || plateLetters.toUpperCase().charAt(i) == 'O' || plateLetters.toUpperCase().charAt(i) == 'U'){
                    System.out.println("Format incorrecte"); //print to console
                    reader.close(); //close Scanner to prevent leaks
                    return;
                }
            }
        }

        reader.close(); //close Scanner to prevent leaks
    }
}
