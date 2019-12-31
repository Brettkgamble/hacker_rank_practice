package Recursion;

public class Recursion {

    public static int Summation(int n) {
        // Base Case - we are at the end
        if (n < 0) {
            return 0; // Additive identity property
        }
        // Recursive Case - Keep going
        else {
            return n + Summation(n-1);
        }
    }

    public static int Factorial(int n) {
        if (n <= 1) {
            return 1; // Multiplicative identity property
        } else {
            return n * Factorial(n-1);
        }
    }

    public static int Exponentiation(int n, int p) {
        // Base case
        if (p <=0) {
            return 1; // Multiplicative Identity
        } else {
            return n * Exponentiation(n, p-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Summation(3));
        System.out.println(Factorial(4));
        System.out.println(Exponentiation(5, 3));
    }
}
