/*
 * tauladiv.java by Martin Lumpickas
 */

import java.util.Scanner;

public class tauladiv {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner
        String userInput = "";

        System.out.print("Introduiu el rang de numeros dels quals voleu fer la taula (min:max): "); //print to console
        userInput = reader.next(); //read user input

        while(userInput.charAt(2) != ':'){
            System.out.print("Heu de fer servir el format corresponent (min:max): "); //print to console
            userInput = reader.next(); //read user input
        }

        int min = Integer.parseInt(userInput.split(":")[0]);
        int max = Integer.parseInt(userInput.split(":")[1]);

        while(min >= max){
            System.out.print("Heu de fer servir el format corresponent (min:max): "); //print to console
            userInput = reader.next(); //read user input
            try {
                min = Integer.parseInt(userInput.split(":")[0]);
                max = Integer.parseInt(userInput.split(":")[1]);
            } catch (Exception e) {
            }
        }

        for(int i = 0; i <= 10; i++){
            if(i == 0){
                System.out.print("   "); //print to console
                for(int j = min; j <= max; j++){
                    System.out.print(j + " "); //print to console
                    checkLast(j, max); //call checkLast function
                }
            } else{
                System.out.print(i + " "); //print to console
                addSpace(i, true);
                for(int j = min; j <= max; j++){
                    if(j % i == 0){
                        System.out.print("* "); //print to console
                        addSpace(j, false);
                    } else{
                        System.out.print("- "); //print to console
                        addSpace(j, false);
                    }
                    checkLast(j, max);
                }
            }
        }

        reader.close(); //close Scanner to prevent leaks
    }

    public static void checkLast(int current, int last){ //checks if a newline char is needed
        if(current == last){
            System.out.print('\n'); //print to console
        }
    }

    public static void addSpace(int current, boolean first){
        if(first == true){
            if(current < 10){
                System.out.print(" "); //print to console
            }
            return;
        }
        if(current >= 10){
            System.out.print(" "); //print to console
        }
    }
}
