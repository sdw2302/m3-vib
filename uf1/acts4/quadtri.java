/*
 * quadtri.java by Martin Lumpickas
 */

public class quadtri{
    public static void main(String[] args) {
        System.out.println("Programa 1"); //print to console
        for(int i = 1; i < 10; i++){
            String line = "";
            for(int j = 1; j < 10; j++){
                line += j + " ";
            }
            System.out.println(line); //print to console
        }
        System.out.println("Programa 2"); //print to console
        for(int i = 1; i < 10; i++){
            String line = "";
            for(int j = 1; j <= i; j++){
                line += j + " ";
            }
            System.out.println(line); //print to console
        }
        System.out.println("Programa 3"); //print to console
        for(int i = 1; i < 10; i++){
            String line = "";
            for(int j = 1; j <= i; j++){
                line += "* ";
            }
            System.out.println(line); //print to console
        }
        System.out.println("Programa 4"); //print to console
        for(int i = 1; i < 10; i++){
            String line = "";
            for(int j = 1; j < 10; j++){
                if(j == i){
                    line += "E ";
                } else {
                    line += "* ";
                }
            }
            System.out.println(line); //print to console
        }
        System.out.println("Programa 5"); //print to console
        for(int i = 1; i < 10; i++){
            String line = "";
            for(int j = 9; j >= i; j--){
                line += "* ";
            }
            System.out.println(line); //print to console
        }
    }
}