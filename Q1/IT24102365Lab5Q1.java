import java.util.Scanner;

public class IT24102365Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int sNumber;
        int lNumber;

        System.out.print("Enter the first integer: ");
        number1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        number2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        number3 = scanner.nextInt();

        if (number1 > number2 && number1 > number3) {
            lNumber = number1;
            sNumber = (number2 > number3) ? number3 : number2;
        } else if (number2 > number1 && number2 > number3) {
            lNumber = number2;
            sNumber = (number1 > number3) ? number3 : number1;
        } else {
            lNumber = number3;
            sNumber = (number1 > number2) ? number2 : number1;
        }
        System.out.println("User entered numbers are :" + number1 + " " + number2 + " " + number3);
        System.out.println("The smallest number is :" + sNumber);
        System.out.print("The largest number is :" + lNumber);

        scanner.close();
    }
}