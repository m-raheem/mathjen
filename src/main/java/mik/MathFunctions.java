package mik;

public class MathFunctions {

    public  int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a non-negative integer");
        }

        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a non-negative integer");
        }

        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public  boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

