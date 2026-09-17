import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java Factorial.java <non-negative integer>");
            System.exit(1);
        }

        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("Error: '" + args[0] + "' is not a valid integer.");
            System.exit(1);
            return;
        }

        if (n < 0) {
            System.err.println("Error: factorial is not defined for negative numbers.");
            System.exit(1);
        }

        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
