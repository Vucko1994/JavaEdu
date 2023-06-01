import java.util.Scanner;

public class KorenSumeKvadrata {
    public static void main(String[] args) {
//        int a = 121;
//        int b = 1122;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite vas broj A: ");
        int a = scanner.nextInt();
        System.out.println("Unesite vas broj B: ");
        int b = scanner.nextInt();

        double c = Math.sqrt(a*a+b*b);

        System.out.println("Resenje je: " + c);
    }
}
