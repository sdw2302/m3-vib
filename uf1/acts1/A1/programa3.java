import java.util.Scanner; 

public class programa3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int firstInt, secondInt, thirdInt, fourthInt;

        System.out.println("Introduiu 4 numeros per separat pulsant 'Enter' despres de cada numero: ");
        firstInt = reader.nextInt();
        secondInt = reader.nextInt();
        thirdInt = reader.nextInt();
        fourthInt = reader.nextInt();

        System.out.println("La suma dels 4 valors es: " + (firstInt + secondInt + thirdInt + fourthInt));
        System.out.println("La mitjana aritmetica dels 4 valors es: " + ((firstInt + secondInt + thirdInt + fourthInt)/4));
    }
}
