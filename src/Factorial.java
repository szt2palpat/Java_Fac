import java.io.FileWriter;
import java.io.IOException;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;


        long iterativeFactorial = calculateFactorialIteratively(n);
        System.out.println(n + " faktoriálisa (ciklus alapú): " + iterativeFactorial);


        long recursiveFactorial = calculateFactorialRecursively(n);
        System.out.println(n + " faktoriálisa (rekurzív): " + recursiveFactorial);
    }

    public static long calculateFactorialIteratively(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negatív szám faktoriálisát nem lehet számolni.");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static long calculateFactorialRecursively(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negatív szám faktoriálisát nem lehet számolni.");
        }


        if (n == 0 || n == 1) {
            return 1;
        }


        return n * calculateFactorialRecursively(n - 1);
    }
}
