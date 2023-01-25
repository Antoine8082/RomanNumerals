import java.util.InputMismatchException;
import java.util.Scanner;

public class RomanNumerals {

    public static void main(String[] args) {
        System.out.println("Bonjour," + "\n" +"Je suis un convertisseur de chiffres Arabes en chiffres Romains.");
        Scanner sc = new Scanner(System.in);
        int num;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Entrez un nombre entier entre 1 et 5000 : ");
            try {
                num = sc.nextInt();
                String roman = convert(num);
                System.out.println("Le nombre " + num + " s'écrit en nombres Romains : " + roman);
                validInput = true;
            } catch (InputMismatchException e) {
                sc.next();
            } catch (Error e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
        System.out.println("A bientôt.");

    }
    public static String convert(int num) {
        if (num < 1 || num > 5000) {
            String errorType = num < 1 ? "bas" : "haut";
            throw new Error("Valeur incorrecte.(Trop " + errorType + ")");
        }

        StringBuilder result = new StringBuilder();
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        for (int i = 0; i < values.length; i++) {
            while (values[i] <= num) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }
        return result.toString();
    }
}
