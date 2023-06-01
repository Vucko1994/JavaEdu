import java.util.Scanner;

public class TwoNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;

        System.out.println("Sum of two numbers is: " + sum);
    }
}
