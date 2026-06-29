package assignment8;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Have you completed your master's? (y/n)");
        char ch = input.next().charAt(0);

        System.out.println("Are you fluent in English? (y/n)");
        char ch1 = input.next().charAt(0);

        if (ch == 'y' && ch1 == 'y') {
            System.out.println("You are eligible for the job interview");
        } 
        else {
            System.out.println("Sorry, you are not eligible for the job interview");
        }

        input.close();
    }
}
