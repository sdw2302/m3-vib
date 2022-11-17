import java.util.Scanner;  

public class programa2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Introduiu el seu any de naixement: ");
        int userYear = reader.nextInt();
        
        System.out.print("Introduiu l'any actual: ");
        int currentYear = reader.nextInt();

        System.out.println("Voste te " + (currentYear - userYear) + " anys");
    }
}
