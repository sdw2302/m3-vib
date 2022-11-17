/*
 * dau.java by Martin Lumpickas
 */

import java.util.Random;

public class dau {
    public static void main(String[] args) {
        Random randomizer = new Random(); //declare Random
        String one = "", two = "", three = "", four = "", five = "", six = "";
        
        for(int i = 0; i < 100; i++){
            int generated = randomizer.nextInt(6) + 1;

            if(generated == 1){
                one += "■";
            } else if(generated == 2){
                two += "■";
            } else if(generated == 3){
                three += "■";
            } else if(generated == 4){
                four += "■";
            } else if(generated == 5){
                five += "■";
            } else {
                six += "■";
            }
        }

        System.out.println(
            "1 " + one +
            "\n2 " + two +
            "\n3 " + three +
            "\n4 " + four +
            "\n5 " + five +
            "\n6 " + six
        ); //print to console
    }
}
