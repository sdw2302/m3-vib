import java.util.Scanner;

/*
 * cinema.java by Martin Lumpickas
 */

public class cinema {
    public static void main(String[] args) {
        int ticket = 5; //default ticket price
        double finalPrice; //final ticket price

        Scanner reader = new Scanner(System.in); //declare Scanner

        System.out.print("Escriviu el dia de la setmana (exemple: Dimecres): "); //ask for user input
        String day = reader.next(); //read user input

        while(checkDay(day) == 'N'){ //check user input
            System.out.println("Torna a escriure el dia de la setmana: "); //
            day = reader.next();
        }

        System.out.println("Te Carnet Jove? Y/N: "); //check for 15% discount
        char discount = reader.next().toUpperCase().charAt(0); //read user input

        if (checkDay(day) == 'L'){ //calculate ticket price
            if (discount == 'Y'){ //check for discount
                finalPrice = ticket * 0.85;
            } else { //if no discount
                finalPrice = ticket;
            }
        } else { //if not 'L'
            if (discount == 'Y'){ //check for discount
                finalPrice = (ticket * 1.1) * 0.85;
            } else { //if no discount
                finalPrice = ticket * 1.1;
            }
        }

        System.out.println("El preu del ticket corresponent es de: " + finalPrice); //return the final ticket price

        reader.close();
    }
    public static char checkDay(String day){ //function to check the day of the week
        switch(day){
            case "Dilluns":
                return 'L';
            case "Dimarts":
                return 'L';
            case "Dimecres":
                return 'L';
            case "Dijous":
                return 'L';
            case "Divendres":
                return 'L';
            case "Dissabte":
                return 'C';
            case "Diumenge":
                return 'C';
            default:
                return 'N'; //if user input is unknown return "N"
        }
    }
}
