import java.util.Scanner;

public class programa1{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Introduiu un numero: ");
        int usrNum = reader.nextInt();
        if (usrNum%2 == 0){
            System.out.println("Parell");
        } else {
            System.out.println("Senar");
        }
    }
}