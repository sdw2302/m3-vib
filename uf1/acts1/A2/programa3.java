import java.util.Scanner;

public class programa3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduiu dos numeros: ");
        int usrNum1 = reader.nextInt();
        int usrNum2 = reader.nextInt();
        if (usrNum1 > usrNum2){
            System.out.println("El primer es mes gran que el segon");
        } else if (usrNum1 < usrNum2){
            System.out.println("El primer es mes petit que el segon");
        } else {
            System.out.println("El primer es igual que el segon");
        }
    }
}
