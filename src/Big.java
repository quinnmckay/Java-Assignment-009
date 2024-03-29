import java.math.BigInteger;

public class Big {


    public static BigInteger factorial(int n) {

        if (n == 0) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i <= 726; i++) {
            BigInteger factorial = factorial(i);
            System.out.println(i + "! = " + factorial);
        }
    }

}

