package usefulMethods;

/**
 * Created by Tim Kilian on 3/23/16.
 */
public class NumberTheory {

    /**
     * Sum of integers (1+2+...+n)
     * @param n limit
     * @return sum of integers
     */
    public long sumOfInteger(int n) {
        return n*(n+1)/2;
    }

    /**
     * Sum of squares (1²+2²+...+n²)
     * @param n limit
     * @return sum of squares
     */
    public long sumOfSquares(int n) {
        return n/6 * (2*n+1) * (n+1);
    }

    /**
     * Collatz algorithm
     * if isOdd: 3*n+1 isEven: n/2
     * @param n starting number
     * @return number of runs
     */
    public int collatz(long n) {
        int i=0;
        while (n>1) {
            if ((n&1)==1) { n = 3*n+1; i++; }
            while ((n&1)==0) { n /= 2; i++; }
        }
        return i;
    }

    /**
     * Longest sequence of the collatz problem in 1..n
     * @param n limit
     * @return number with the longest sequence
     */
    public int longestCollatzSequence(int n) {
        int max = 0, at = 0;
        for (int i = 1; i <= n; i++) {
            int temp = collatz(i);
            if (max < temp) {
                max = temp;
                at = i;
            }
        }
        return at;
    }


}
