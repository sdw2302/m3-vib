import java.util.Scanner;

public class programa2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Introduiu un numero: ");
        int usrNum = reader.nextInt();
        if (usrNum > 0){
            System.out.println("Positiu");
        } else if (usrNum < 0){
            System.out.println("Negatiu");
        } else {
            System.out.println("Zero");
        }
    }
}


