import java.util.Scanner;

public class IT22228208Lab5Q3 {
    public static void main(String[] args) {

        // Constants
        final double ROOM_CHARGE_PER_DAY = 48000.0;
        final int DISCOUNT_3_4_DAYS = 10;
        final int DISCOUNT_5_MORE_DAYS = 20;
        final int MIN_DAY = 1;
        final int MAX_DAY = 31;

        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        // Validation 1 - dates must be between 1 and 31
        if (startDate < MIN_DAY || startDate > MAX_DAY || 
            endDate < MIN_DAY || endDate > MAX_DAY) {
            System.out.println("Error: Days must be between 1 and 31");

        // Validation 2 - start date must be less than end date
        } else if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");

        } else {

            // Calculate number of days
            int numDays = endDate - startDate;

            // Calculate discount
            double discountRate = 0;
            if (numDays >= 3 && numDays <= 4) {
                discountRate = DISCOUNT_3_4_DAYS;
            } else if (numDays >= 5) {
                discountRate = DISCOUNT_5_MORE_DAYS;
            }

            // Calculate total amount
            double totalAmount = ROOM_CHARGE_PER_DAY * numDays;
            totalAmount = totalAmount - (totalAmount * discountRate / 100);

            // Display results
            System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
            System.out.println("Number of Days Reserved: " + numDays);
            System.out.println("Total Amount to be Paid: " + totalAmount);
        }

        scanner.close();
    }
}