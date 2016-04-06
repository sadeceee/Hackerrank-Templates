package usefulMethods;

/**
 * Created by Tim Kilian on 3/28/16.
 */
public class Arrays {

    public int findMaxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int m : arr) max = Math.max(max, m);
        return max;
    }

    public int findMinElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int m : arr) min = Math.min(min, m);
        return min;
    }

    public int sumOfElements(int[] arr) {
        int sum = 0;
        for (int m : arr) sum += m;
        return sum;
    }

    public int productOfElements(int[] arr) {
        int product = 1;
        for (int m : arr) product *= m;
        return product;
    }
}
