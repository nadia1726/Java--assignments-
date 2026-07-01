package assignment9;

import java.util.Scanner;

public class Assignment9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Select an option (1-3): ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println("Selected language is Bengali");
                break;

            case 2:
                System.out.println("Selected language is Hindi");
                break;

            case 3:
                System.out.println("Selected language is Urdu");
                break;

            default:
                System.out.println("Selected language is English");
        }

        input.close();
    }
}
