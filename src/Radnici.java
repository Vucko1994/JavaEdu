import java.util.Scanner;

public class Radnici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radnik 1 odradi za: ");
        int x = scanner.nextInt();
        System.out.println("Radnik 2 odradi za: ");
        int y = scanner.nextInt();

        System.out.println("Zajedno odrade posao za: ");
        double c = x * y / (x + y);

        System.out.println(c);
    }
}
