package assignment_02;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num2 != 0 ? (num1 / num2) : "Cannot divide by zero"));
        
        input.close();
    }
}
