public class RomanNumerals {

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
