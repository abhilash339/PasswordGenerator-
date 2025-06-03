
import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String special = "!@#$%^&*()-_=+<>?";

        String passwordCharacters = "";

        System.out.print("Enter password length: ");
        int length = input.nextInt();

        System.out.print("Include uppercase letters? (y/n): ");
        if (input.next().equalsIgnoreCase("y")) {
            passwordCharacters += upper;
        }

        System.out.print("Include lowercase letters? (y/n): ");
        if (input.next().equalsIgnoreCase("y")) {
            passwordCharacters += lower;
        }

        System.out.print("Include numbers? (y/n): ");
        if (input.next().equalsIgnoreCase("y")) {
            passwordCharacters += numbers;
        }

        System.out.print("Include special characters? (y/n): ");
        if (input.next().equalsIgnoreCase("y")) {
            passwordCharacters += special;
        }

        if (passwordCharacters.isEmpty()) {
            System.out.println("Error: No character types selected!");
            return;
        }

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(passwordCharacters.length());
            password.append(passwordCharacters.charAt(index));
        }

        System.out.println("Generated Password: " + password);
        input.close();
    }
}
