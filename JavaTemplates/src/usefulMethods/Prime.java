package usefulMethods;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tim Kilian on 22.02.16.
 * source:
 * isPrime : http://java.soeinding.de/content.php/primzahl
 */
public class Prime {
    public static final long mod = 1000000007;

    /**
     * Check if number is prime
     * @param value number
     * @return is prime?
     */
    public static boolean isPrime(final long value) {
        if (value <= 16)
            return (value == 2 || value == 3 || value == 5 || value == 7 || value == 11 || value == 13);
        if (value%2 == 0 || value % 3 == 0 || value % 5 == 0 || value % 7 == 0)
            return false;
        for (long i=10; i*i <= value; i+=10) {
            if (value % (i+1) == 0) return false;
            if (value % (i+3) == 0) return false;
            if (value % (i+7) == 0) return false;
            if (value % (i+9) == 0) return false;
        }
        return true;
    }

    /**
     * Give all prime numbers between a and b (a<b)
     * @param a Start inclusive
     * @param b End exclusive
     * @return List of primes
     */
    public static List<Integer> primesBetween(final int a, final int b) {
        List<Integer> p = new ArrayList<Integer>();
        for (int i=a; i<b; i++)
            if (isPrime(i)) p.add(i);
        return p;
    }

    /**
     * greatest common divisor of two numbers
     * @param a first
     * @param b second
     * @return greatest divisor
     */
    public static int gcd(int a, int b) {
        if (b==0) return a;
        return (a>b) ? gcd(a-b, b) : gcd(a, b-a);
    }
}
