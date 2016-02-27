package algorithms;

/**
 * Created by Tim Kilian on 27.02.16.
 */
public class Search {

    // Searching in Arrays

    /**
     * Linear Search
     * O(n)
     * @param arr array
     * @param x searched element
     * @return position of element
     */
    public static int linearSearch(final int[] arr, final int x) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i]==x) return i;
        return -1;
    }

    /**
     * Binary Search
     * O(log(n))
     * @param arr sorted array
     * @param x searched element
     * @return position of element
     * @require array must be sorted
     */
    public static int binarySearch(final int[] arr, final int x) {
        return binarySearch(arr, x, 0, arr.length-1);
    }

    public static int binarySearch(final int[] arr, final int x, int left, int right) {
        int mid = (left+right)/2;
        if (right < left) return -1;

        if (arr[mid] < x) return binarySearch(arr, x, mid+1, right);
        else if (arr[mid] > x) return binarySearch(arr, x, left, mid-1);
        return mid;
    }

    /**
     * Interpolation Search
     * Average-Case: O(log(log(n))) Worst-Case: O(n)
     * @param arr sorted array
     * @param x searched element
     * @return position of element
     * @require array musst be sorted
     */
    public static int interpolationSearch(final int[] arr, final int x) {
        return interpolationSearch(arr, x, 0, arr.length - 1);
    }

    public static int interpolationSearch(final int[] arr, final int x, int left, int right) {
        int mid = left + ((x-arr[left])/(arr[right]-arr[left]))*(right-left);
        if (right < left) return -1;

        if (arr[left] == x || arr[mid] == x || arr[right] == x) return mid;
        else if (arr[mid] < x) return interpolationSearch(arr, x, mid + 1, right);
        else return interpolationSearch(arr, x, left, mid - 1);
    }
}
