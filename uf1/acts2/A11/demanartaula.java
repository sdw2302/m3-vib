/*
 * demanartaula.java by Martin Lumpickas
 */

import java.util.Scanner;

public class demanartaula {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner
        boolean isCompleted = false;
        
        System.out.print("De quin numero vols la taula?: "); //print to console
        int userInput = reader.nextInt(); //read user input
        
        while(isCompleted != true){
            int i = 0;
            int errors = 0;
            while(i < 10){
                System.out.print(userInput + " x " + (i + 1) + " = "); //print to console
                int answer = reader.nextInt(); //read user input

                if(answer == (userInput * (i + 1))){
                    System.out.println("Correcte"); //print to console
                } else {
                    System.out.print("Incorrecte, torna a escriure la resposta correcta: "); //print to console
                    answer = reader.nextInt(); //read user input

                    if(answer == (userInput * (i + 1))){
                        System.out.println("Correcte"); //print to console
                    } else {
                        System.out.println("Incorrecte"); //print to console
                        errors++;
                    }
                }
                if(errors == 3){
                    System.out.println("3 errors, tornem al principi"); //print to console
                    break; //restart while
                }
                i++; //add 1 to i
                if(i == 10){
                    isCompleted = true; //end while
                }
            }
        }
        
        reader.close(); //close Scanner to prevent leaks
    }
}
