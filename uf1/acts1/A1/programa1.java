import java.util.Scanner;  

public class programa1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Introduiu el primer numero: ");
        int x = reader.nextInt();

        System.out.print("Introduiu el segon numero: ");
        int y = reader.nextInt();

        System.out.println("\nEl resultat de " + x + " + " + y + " es " + (x + y)
            + "\nEl resultat de " + x + " - " + y + " es " + (x - y)
            + "\nEl resultat de " + x + " * " + y + " es " + (x * y)
            + "\nEl resultat de " + x + " / " + y + " es " + (x / y));

        reader.close();
    }
}
