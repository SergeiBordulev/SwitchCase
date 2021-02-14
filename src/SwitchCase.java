import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the operand №1");
        int number1 = scanner.nextInt();

        System.out.println("Enter the operand №2");
        int number2 = scanner.nextInt();

        System.out.println("Enter the command number from 1 to 4");
        int commandCode = scanner.nextInt();

        switch (commandCode) {
            case 1:
                System.out.println("The result of addition: " + (number1 + number2));
                break;
            case 2:
                System.out.println("The result of the subtraction: " + (number1 - number2));
                break;
            case 3:
                System.out.println("The result of the multiplication: " + (number1 * number2));
                break;
            case 4:
                System.out.println("The result of the division: " + (number1 / (double) number2));
                break;
            default:
                System.out.println("You entered the wrong command");
        }
    }
}
