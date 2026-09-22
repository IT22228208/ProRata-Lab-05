import java.util.Scanner;

public class IT22228208Lab5Q1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Read three integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();
        
        // Find smallest
        int smallest = num1;
        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;
        
        // Find largest
        int largest = num1;
        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;
        
        // Display results
        System.out.println("\nUser entered numbers are : " + num1 + " " + num2 + " " + num3);
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);
        
        scanner.close();
    }
}