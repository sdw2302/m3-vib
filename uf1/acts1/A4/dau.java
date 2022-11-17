import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class dau{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random randomizer = new Random();
        System.out.print("Quants euros vols apostar: ");
        int bet = reader.nextInt();
        System.out.print("\nLlencant el dau... ");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int res  = randomizer.nextInt(6) + 1;
        System.out.println(res);
        if (res % 2 == 1){
            System.out.println("Has perdut l'aposta");
        } else {
            if (res == 2){
                System.out.println("Has guanyat " + (bet * 3) + " Euros");
            } else if (res == 4){
                System.out.println("Has guanyat " + (bet * 2) + " Euros");
            } else {
                System.out.println("Has perdut " + (bet/2) + " Euros");
            }
        }
    }
}