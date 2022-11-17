import java.util.Scanner;  

public class programa5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double startPoint = 5.5, speed = 3.2;
        int time, h = 0, m = 0, s = 0;
        String totalTime;

        System.out.println("Introduiu el temps per calcular el espai recorregut per l'objecte: ");
        time = reader.nextInt();

        h = time / 3600;
        m = (time - (h * 3600)) / 60;
        s = ((time - (h * 3600) - (m * 60))) % 60;

        if (h > 0){
            totalTime = h + " hores, " + m + " minuts i " + s + " segons";
        } else if (h == 0 && m > 0){
            totalTime = m + " minuts i " + s + " segons";
        } else {
            totalTime = s + " segons";
        }

        System.out.println("El espai que he recorregut l'objecte en " + totalTime + " ha sigut " + (startPoint + (speed * time)) + " metres.");
    }
}
