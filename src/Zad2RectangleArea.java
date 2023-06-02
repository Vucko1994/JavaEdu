import java.util.Scanner;

public class Zad2RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("Area of the rectangle is: " + area);
    }
}
