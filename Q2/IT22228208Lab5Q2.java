import java.util.Scanner;

public class IT22228208Lab5Q2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        System.out.print("Enter the number of new members introduced: ");
        int newMembers = scanner.nextInt();
        
        // Validate input
        if (newMembers < 0) {
            System.out.println("Input must be a number 0 or greater");
        } else {
            
            // Use switch - cap at 5 for "5 or more" case
            int switchValue = (newMembers >= 5) ? 5 : newMembers;
            
            switch (switchValue) {
                case 0:
                    System.out.println("No Prize");
                    break;
                case 1:
                    System.out.println("Prize is a : Pen");
                    break;
                case 2:
                    System.out.println("Prize is a : Umbrella");
                    break;
                case 3:
                    System.out.println("Prize is a : Bag");
                    break;
                case 4:
                    System.out.println("Prize is a : Travelling Chair");
                    break;
                case 5:
                    System.out.println("Prize is a : Headphone");
                    break;
            }
        }
        
        scanner.close();
    }
}