import java.util.Scanner;

public class IT24102365Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int memberscount;

        System.out.print("Enter the number of new members introduced: ");
        memberscount = scanner.nextInt();

        if (memberscount < 0) {
            System.out.print("Input must be a number 0 or grater");
        } else {
            switch (memberscount) {
                case 0:
                    System.out.print("No price");
                    break;

                case 1:
                    System.out.print("Price is a : Pen");
                    break;

                case 2:
                    System.out.print("Price is a : Umbrella");
                    break;

                case 3:
                    System.out.print("Price is a : Bag");
                    break;

                default:
                    System.out.print("Price is a : Travelling chair");
                    break;
            }
        }

        scanner.close();
    }
}