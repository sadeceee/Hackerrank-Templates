package templates;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by Tim Kilian on 26.02.16.
 */

public class Testing {
    private InputStream in;
    private PrintWriter out;
    private Scanner sc;
    private boolean period = true;

    public void solution() {
        int n = readInt();
        int[] arr = readInt(n);

        printOut(interpolationSearch(arr, 5));
    }

    public static int interpolationSearch(final int[] arr, final int x) {
        return interpolationSearch(arr, x, 0, arr.length - 1);
    }

    public static int interpolationSearch(final int[] arr, final int x, int left, int right) {
        int mid = left + ((x-arr[left])/(arr[right]-arr[left]))*(right-left);
        if (right < left) return -1;

        if (arr[left] == x || arr[mid] == x || arr[right] == x) return mid;
        else if (arr[mid] < x) return interpolationSearch(arr, x, mid + 1, right);
        else if (arr[mid] > x) return interpolationSearch(arr, x, left, mid - 1);
        return mid;
    }

    public void run() {
        in = System.in;
        out = new PrintWriter(System.out);
        sc = new Scanner(in);
        long time = System.currentTimeMillis();

        int T = 1;
//        T = readInt();
        while (T-- > 0)
            solution();

        out.flush();
        if (period) printOut(System.currentTimeMillis() - time + " ms");
        exit();
    }

    public static void main(String[] args) {
        new Testing().run();
    }

    private int readInt() {
        return sc.nextInt();
    }

    private int[] readInt(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = readInt();
        return arr;
    }

    private List<Integer> readIntAsList(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) list.add(readInt());
        return list;
    }

    private long readLong() {
        return sc.nextLong();
    }

    private long[] readLong(int n) {
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) arr[i] = readLong();
        return arr;
    }

    private String readString() {
        return sc.next();
    }

    private double readDouble() {
        return Double.parseDouble(readString());
    }

    private static void printOut(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }

    public static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (String s : arr)
            System.out.print(s + " ");
        System.out.println();
    }

    private void exit() {
        out.close();
        System.exit(0);
    }
}