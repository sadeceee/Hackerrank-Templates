package usefulMethods;

/**
 * Created by Tim Kilian on 3/23/16.
 */
public class NumberTheory {

    public long sumOfInteger(int n) {
        return n*(n+1)/2;
    }

    public long sumOfSquares(int n) {
        return n/6 * (2*n+1) * (n+1);
    }

    public int collatz(long n) {
        int i=0;
        while (n>1) {
            if ((n&1)==1) n = 3*n+1; i++;
            while ((n&1)==0) { n /= 2; i++; }
        }
        return i;
    }

    public int longestCollatzSequence(int n) {
        int max = 0;
        int at = 0;
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
