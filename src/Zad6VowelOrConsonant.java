import java.util.Scanner;

public class Zad6VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter character: ");
        char character = scanner.next().charAt(0);

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println("Entered character is vowel.");
        } else {
            System.out.println("Entered character is consonant");
        }
    }
}
