import java.util.Scanner;

public class IT24102365Lab5Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double chargePerDay = 48000.0;
        double totalAmount;
        int startDate, endDate, reservedDates;

        System.out.print("Enter start date (1-31): ");
        startDate = scanner.nextInt();

        System.out.print("Enter end date (1-31): ");
        endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        reservedDates = endDate - startDate;
        totalAmount = reservedDates * chargePerDay;

        if (reservedDates < 3) {
            System.out.println("Total Amount to be paid: " + totalAmount);
        } else if (3 <= reservedDates && reservedDates <= 4) {
            totalAmount = totalAmount - (reservedDates * chargePerDay * 0.1);
        } else {
            totalAmount = totalAmount - (reservedDates * chargePerDay * 0.2);
        }

        System.out.println("Room charge per day: Rs. " + chargePerDay + "/=");
        System.out.println("Number of days reserved: " + reservedDates);
        System.out.println("Total Amount to be paid: Rs. " + totalAmount + "/=");

        scanner.close();
    }
}