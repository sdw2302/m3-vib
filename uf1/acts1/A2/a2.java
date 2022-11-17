import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int usrNum1, usrNum2;

        System.out.println("Programa 1");

        System.out.print("Introduiu un numero: ");
        usrNum1 = reader.nextInt();
        if (usrNum1%2 == 0){
            System.out.println("Parell");
        } else {
            System.out.println("Senar");
        }

        System.out.println("Programa 2");

        System.out.print("Introduiu un numero: ");
        usrNum1 = reader.nextInt();
        if (usrNum1 > 0){
            System.out.println("Positiu");
        } else if (usrNum1 < 0){
            System.out.println("Negatiu");
        } else {
            System.out.println("Zero");
        }

        System.out.println("Programa 3");

        System.out.println("Introduiu dos numeros: ");
        usrNum1 = reader.nextInt();
        usrNum2 = reader.nextInt();
        if (usrNum1 > usrNum2){
            System.out.println("El primer es mes gran que el segon");
        } else if (usrNum1 < usrNum2){
            System.out.println("El primer es mes petit que el segon");
        } else {
            System.out.println("El primer es igual que el segon");
        }

        System.out.println("Programa 4");

        System.out.println("Introduiu dos numeros, el primer ha de ser major que el segon: ");
        usrNum1 = reader.nextInt();
        usrNum2 = reader.nextInt();
        if (usrNum1 < usrNum2){
            System.out.println("Error: No s'ha complert la condicio inicial");
        } else {
            System.out.println(usrNum1 + " + " + usrNum2 + " = " + (usrNum1 + usrNum2));
            System.out.println(usrNum1 + " - " + usrNum2 + " = " + (usrNum1 - usrNum2));
            System.out.println(usrNum1 + " * " + usrNum2 + " = " + (usrNum1 * usrNum2));
            System.out.println(usrNum1 + " / " + usrNum2 + " = " + (usrNum1 / usrNum2));
        }

        System.out.println("Programa 5");

        System.out.print("Introduiu una quantitat: ");
        usrNum1 = reader.nextInt();
        if (usrNum1 < 500){
            System.out.println(usrNum1*0.95);
        } else if (usrNum1 < 1000){
            System.out.println(usrNum1*0.92);
        } else if (usrNum1 <= 5000){
            System.out.println(usrNum1*0.85);
        } else {
            System.out.println(usrNum1*0.75);
        }
    }
}
