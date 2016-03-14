package algorithms;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Tim Kilian on 22.02.16.
 */
public class Sorting {

    // Stable algorithms

    /**
     * Bubblesort
     * Best-Case: O(n) Average-Case: O(n²) Worst-Case: O(n²)
     * @param arr unsorted array
     * @return sorted array
     */
    public static int[] bubbleSort(int[] arr) {
        for (int l = arr.length-1; l>0; l--)
            for (int i = 0; i < l; i++)
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;
                }
        return arr;
    }

    /**
     * Insertionsort
     * Best-Case: O(n) Average-Case: O(n²) Worst-Case: O(n²)
     * @param arr unsorted array
     * @return sorted array
     */
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int a = arr[i];
            int j = i;
            while (j>0 && arr[j-1]>a)
                arr[j] = arr[--j];
            arr[j] = a;
        }
        return arr;
    }

    /**
     * Countingsort
     * Best-Case: O(n+k) Average-Case: O(n+k) Worst-Case: O(n+k)
     * @param ar unsorted array
     * @return sorted array
     */
    private int[] countingSort(int[] ar) {
        return countingSort(ar, 100);
    }

    private int[] countingSort(int[] ar, int k) {
        int[] arr = new int[k];
        int[] brr = new int[ar.length];

        for (int i = 0; i < arr.length; arr[i++] = 0);
        for (int i = 0; i < ar.length; arr[ar[i++]]++);
        for (int i = 1; i < arr.length; arr[i] += arr[i++ -1]);
        for (int i = brr.length-1; i >= 0 ; brr[--arr[ar[i]]] = ar[i--]);

        return brr;
    }

    /**
     * Mergesort
     * Best-Case: O(n*log(n)) Average-Case: O(n*log(n)) Worst-Case: O(n*log(n))
     * @param list unsorted list
     * @return sorted list
     */
    public static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() <= 1) return list;
        else {
            List<Integer> left = new LinkedList<Integer>();
            left.addAll(list.subList(0, list.size()/2));
            List<Integer> right = new LinkedList<Integer>();
            right.addAll(list.subList(list.size()/2, list.size()));
            left = mergeSort(left);
            right = mergeSort(right);
            return merge(left, right);
        }
    }

    private static List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> temp = new LinkedList<Integer>();
        while (!right.isEmpty() && !left.isEmpty()) {
            if (left.get(0)<=right.get(0)) temp.add(left.remove(0));
            else temp.add(right.remove(0));
        }
        while (!left.isEmpty()) temp.add(left.remove(0));
        while (!right.isEmpty()) temp.add(right.remove(0));
        return temp;
    }

    /**
     * Natural Mergesort
     * Best-Case: O(n) Average-Case: O(n*log(n)) Worst-Case: O(n*log(n))
     * @param list unsorted List
     * @return sorted List
     */
    public static List<Integer> naturalMergeSort(List<Integer> list) {
        if (list.size() <= 1) return list;
        else {
            List<List<Integer>> runs = new LinkedList<List<Integer>>();
            for (int i = 0, j = 0; i < list.size(); j++) {
                runs.add(new LinkedList<Integer>());
                if (runs.get(j).isEmpty()) runs.get(j).add(list.get(i++));
                while (i<list.size() && list.get(i-1)<list.get(i))
                    runs.get(j).add(list.get(i++));
            }
            while (runs.size()!=1) {
                for (int i = 0; i < runs.size()/2; i++)
                    runs.set(i, merge(runs.get(i), runs.remove(++i)));
            }
            return runs.get(0);
        }
    }

    /**
     * Timsort
     *
     * @param arr
     * @return
     */
    public static int[] timSort(int[] arr) {
        return null;
    }

    // Instable algorithms

    /**
     * Quicksort
     * Best-Case: O(n*log(n)) Average-Case: O(n*log(n)) Worst-Case: O(n*log(n))
     * @param arr unsorted array
     * @return sorted array
     */
    public static int[] quickSort(int[] arr) {
        return quickSort(arr.clone(), 0, arr.length-1);
    }

    private static int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int divisor = partition(arr, left, right);
            quickSort(arr, left, divisor-1);
            quickSort(arr, divisor+1, right);
        }
        return arr;
    }

    private static int partition(int[] arr, int left, int right) {
        int i = left;
        int j = right-1;
        int pivot = arr[right];

        do {
            while (pivot>=arr[i] && i<right) i++;
            while (pivot<=arr[j] && j>left) j--;

            if (i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        } while (i<j);

        if (arr[i]>pivot) {
            int temp = pivot;
            arr[right] = arr[i];
            arr[i] = temp;
        }

        return i;
    }
}
