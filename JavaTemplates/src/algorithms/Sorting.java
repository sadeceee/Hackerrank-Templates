package algorithms;

/**
 * Created by Tim Kilian on 22.02.16.
 */
public class Sorting {

    // Stable algorithms

    /**
     * Bubblesort
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
     * @param arr unsorted array
     * @return sorted array
     */
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int a = arr[i];
            int j = i;
            while (j>0 && arr[j]>a)
                arr[j] = arr[--j];
            arr[j] = a;
        }
        return arr;
    }


    // Instable algorithms


    public static int[] quickSort(int[] arr) {
        return null;
    }
}
