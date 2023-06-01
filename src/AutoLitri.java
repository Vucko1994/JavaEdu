import java.util.Scanner;

public class AutoLitri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite litre: ");
        int x = scanner.nextInt();
        System.out.println("Unesite km: ");
        int y = scanner.nextInt();


        int potrosnjaNaSto = x * 100 / y;

        System.out.println("Potrosnja goriva na 100km: " + potrosnjaNaSto);
    }
}
