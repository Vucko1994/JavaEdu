import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        int minNumber = Math.min(firstNumber, secondNumber);
        int maxNumber = Math.max(firstNumber, secondNumber);

        System.out.println("Between " + firstNumber + " and " + secondNumber + " minimal number is: " + minNumber + " and maximal number is: " + maxNumber);
    }
}
