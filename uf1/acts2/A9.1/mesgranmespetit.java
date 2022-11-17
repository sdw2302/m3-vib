/*
 * mesgranmespetit.java by Martin Lumpickas
 */

import java.util.Arrays;
import java.util.Scanner;

public class mesgranmespetit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //declare Scanner
        int[] array = new int[5]; //declare array with length of five

        System.out.println("Introduiu 5 numeros per separat:"); //print to console
        array[0] = reader.nextInt(); //read user input; //read user input
        array[1] = reader.nextInt(); //read user input
        array[2] = reader.nextInt(); //read user input
        array[3] = reader.nextInt(); //read user input
        array[4] = reader.nextInt(); //read user input

        Arrays.sort(array); //sort the array from smallest to biggest number

        int biggest = array[4]; //get biggest number from the sorted array
        int smallest = array[0]; //get the smallest number from the sorted array

        System.out.println("El numero mes gran es el: " + biggest + " i el mes petit es el: " + smallest); //print to console

        reader.close(); //close Scanner to prevent leaks
    }
}
