import java.util.Scanner;  

public class programa4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int i, c, r, t;

        System.out.println("Introduiu el capital: ");
        c = reader.nextInt();
        System.out.println("Introduiu la taxa d'interes nominal en un tant percent: ");
        r = reader.nextInt();
        System.out.println("Introduiu el periode de calcul en dies: ");
        t = reader.nextInt();
        i = (c*r*t)/(360*100);
        System.out.println("Interessos produits: " + i);
        System.out.println("Capital total acumulat: " + (c + i));
    }
}
