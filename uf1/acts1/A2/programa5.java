import java.util.Scanner;

public class programa5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Introduiu una quantitat: ");
        int usrNum = reader.nextInt();
        if (usrNum < 500){
            System.out.println(usrNum*0.95);
        } else if (usrNum < 1000){
            System.out.println(usrNum*0.92);
        } else if (usrNum <= 5000){
            System.out.println(usrNum*0.85);
        } else {
            System.out.println(usrNum*0.75);
        }
    }
}
