  package assignment7;

import java.util.Scanner;

public class Assignment7 {

    public static void main(String[] args) {
        System.out.println("DO YOU LOVE JAVA? ");

        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);

        if (ch == 'Y' || ch == 'y') {
            System.out.println("YOU ARE A JAVA LOVER");
        } 
        else if (ch == 'N' || ch == 'n') {
            System.out.println("YOU ARE NOT A JAVA LOVER");
        } 
        else {
            System.out.println("INVALID INPUT ");
        }

        input.close();
    }
}
