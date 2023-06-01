import java.util.Scanner;

public class AutoKmH {
    //3600
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite brzinu u km/h: ");
        int kmH = scanner.nextInt();

        int mS = kmH * 1000 / 3600;

        System.out.println("Brzina u m/s je: " + mS);
    }
}
