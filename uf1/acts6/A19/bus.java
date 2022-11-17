/*
* bus.java by Martin Lumpickas
*/

import java.util.Scanner;

public class bus{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner
        String[] destins = new String[6];
        destins[0] = "Tarragona;0";
        destins[1] = "Altafulla;14";
        destins[2] = "Torredembarra;17";
        destins[3] = "Creixell;25";
        destins[4] = "Roda de Bara;30";
        destins[5] = "El Vendrell;40";

        System.out.print("Origen (de 1 a 6): "); //print to console
        int start = reader.nextInt() - 1; //read user input

        System.out.print("Destinacio (de 1 a 6): "); //print to console
        int end = reader.nextInt() - 1; //read user input

        System.out.print("Anada/Tornada (s/n): "); //print to console
        boolean isReturning;

        if(reader.next().toLowerCase().charAt(0) == 's'){
            isReturning = true;
        } else {
            isReturning = false;
        }

        double kmprice = 0.08;

        String startcity = destins[start].split(";")[0];
        int startkm = Integer.parseInt(destins[start].split(";")[1]);
        String endcity = destins[end].split(";")[0];
        int endkm = Integer.parseInt(destins[end].split(";")[1]);

        int distance;

        if(startkm > endkm){
            distance = startkm - endkm;
        } else {
            distance = endkm - startkm;
        }

        System.out.println("\nOrigen: " + startcity); //print to console
        System.out.println("Desti: " + endcity); //print to console
        System.out.println("Km: " + distance / 2); //print to console
        System.out.print("A/T: "); //print to console

        if(isReturning == true){
            System.out.println("Si"); //print to console
            System.out.println("Descompte: 5%"); //print to console
            distance *= 2;
            kmprice *= 0.95;
        } else {
            System.out.println("No"); //print to console
        }

        double totalprice = distance * kmprice;

        System.out.println("Preu: " + totalprice); //print to console

        reader.close(); //close Scanner to prevent leaks
    }
}