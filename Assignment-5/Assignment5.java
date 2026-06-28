package assignment5;

import java.util.Scanner;

public class Assignment5 {

    public static void main(String[] args) {
        System.out.print("Enter any positive integer:");
        Scanner input = new Scanner(System.in);
        int number= input.nextInt();

        if (number%2==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        input.close();
    }
}
