import java.util.Scanner;

/*
 * zodiac.java by Martin Lumpickas
 */

public class zodiac {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int usrInput;
        String result;
        System.out.print("Introduiu un numero associat amb un dels seguents dels signes del zodiac per veure la seva categoria: ");
        System.out.println("\n1 - Aries\n2 - Capricorn\n3 - Balança\n4 - Cranc\n5 - Lleo\n6 - Taure\n7 - Aquari\n8 - Escorpio\n9 - Sagitari\n10 - Verge\n11 - Bessons\n12 - Peixos");

        usrInput = reader.nextInt();

        switch(usrInput){
            case 1:
                result = "Foc";
                break;
            case 2:
                result = "Terra";
                break;
            case 3:
                result = "Aire";
                break;
            case 4:
                result = "Aigua";
                break;
            case 5:
                result = "Foc";
                break;
            case 6:
                result = "Terra";
                break;
            case 7:
                result = "Aire";
                break;
            case 8:
                result = "Aigua";
                break;
            case 9:
                result = "Foc";
                break;
            case 10:
                result = "Terra";
                break;
            case 11:
                result = "Aire";
                break;
            case 12:
                result = "Aigua";
                break;
            default:
                result = "ERROR: " + usrInput + " no associat a cap signe.";
                break;
        }
        System.out.println(result);
    }
}
