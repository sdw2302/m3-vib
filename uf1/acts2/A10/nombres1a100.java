/*
 * nombres1a100.java by Martin Lumpickas
 */

public class nombres1a100 {
    public static void main(String[] args) {
        int i = 0; //declare needed vars
        String separator = "---------------------------------------------\n";
        String toBePrinted = separator;

        while (i < 100){ //do 100 times
            i++; //add 1 to i
            if (i < 10){ //add needed spaces to make the table even
                toBePrinted += "  "; 
            } else if (i < 100){
                toBePrinted += " ";
            }
            if (i % 8 == 0){ //add new line character after every number dividable by 8 and after 100
                toBePrinted += i + "\n";
                toBePrinted += separator;
            } else if (i == 100){
                toBePrinted += i + "\n";
                toBePrinted += separator;
            } else { //add separator between numbers
                toBePrinted += i + " | ";
            }
        }
        System.out.println(toBePrinted); //print to console
    }
}
