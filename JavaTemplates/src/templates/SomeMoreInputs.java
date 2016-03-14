package templates;

import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Tim Kilian on 23.02.16.
 */

public class SomeMoreInputs {
    private InputStream in;
    private PrintWriter out;
    private Scanner sc;
    private boolean period = false;

    public void solution() {

    }

    // TODO graph inputs, and more

    public void run() {
        in = System.in;
        out = new PrintWriter(System.out);
        sc = new Scanner(in);
        long time = System.currentTimeMillis();

        int T = 1;
//        T = readInt();
        while (T-->0)
            solution();

        out.flush();
        if (period) printOut(System.currentTimeMillis() - time + " ms");
        exit();
    }

    public static void main(String[] args) {
        new SomeMoreInputs().run();
    }

    private int readInt() {
        return sc.nextInt();
    }

    private int[] readInt(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = readInt();
        return arr;
    }

    private List<Integer> readList(int n) {
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

    private List<Long> readList(long n) {
        List<Long> list = new ArrayList<Long>();
        for (int i = 0; i < n; i++) list.add(readLong());
        return list;
    }

    private String readString() {
        return sc.next();
    }

    private String[] readString(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = readString();
        return arr;
    }

    private double readDouble() {
        return Double.parseDouble(readString());
    }

    private double[] readDouble(int n) {
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) arr[i] = readDouble();
        return arr;
    }

    private static void printOut(Object... o) {
        System.out.println(Arrays.deepToString(o));
    }

    public static void printArray(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    public static <T> void printList(List<T> arr) {
        for (T i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    private void exit() { out.close(); System.exit(0); }
}