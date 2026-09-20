import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Factorial <number>");
            return;
        }

        int number;
        try {
            number = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Error: \"" + args[0] + "\" is not a valid integer.");
            return;
        }

        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
            return;
        }

        System.out.println("Factorial of " + number + " = " + factorial(number));
    }

    private static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
