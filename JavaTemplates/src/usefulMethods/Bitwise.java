package usefulMethods;

/**
 * Created by Tim Kilian on 02.03.16.
 */
public class Bitwise {

    public static boolean isEven(int n) {
        return (n&1)==0;
    }

    public static boolean isOdd(int n) {
        return (n&1)==1;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n-1))==0;
    }
}
