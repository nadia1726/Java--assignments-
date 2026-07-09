package assignment11;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int x = input.nextInt();

        if (x < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;

            for (int i = 1; i <= x; i++) {
                factorial =factorial* i;
            }

            System.out.println("Factorial = " + factorial);
        }

        input.close();
    }
}
