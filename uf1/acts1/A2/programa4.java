import java.util.Scanner;

public class programa4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduiu dos numeros, el primer ha de ser major que el segon: ");
        int usrNum1 = reader.nextInt();
        int usrNum2 = reader.nextInt();
        if (usrNum1 < usrNum2){
            System.out.println("Error: No s'ha complert la condicio inicial");
        } else {
            System.out.println(usrNum1 + " + " + usrNum2 + " = " + (usrNum1 + usrNum2));
            System.out.println(usrNum1 + " - " + usrNum2 + " = " + (usrNum1 - usrNum2));
            System.out.println(usrNum1 + " * " + usrNum2 + " = " + (usrNum1 * usrNum2));
            System.out.println(usrNum1 + " / " + usrNum2 + " = " + (usrNum1 / usrNum2));
        }
    }
}
