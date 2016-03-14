package templates;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Tim Kilian on 21.02.16.
 * Inspired by Uwi Tenpen
 */

public class MainTemplate {
    private InputStream in;
    private PrintWriter out;
    private Scanner sc;
    private String customIN = "";

    public void solution() {

    }

    public void solve() {
        int T = 1;
//        T = readInt();
        while(T-->0)
            solution();
    }

    public void run() {
        in = customIN.isEmpty()? System.in : new ByteArrayInputStream(customIN.getBytes());
        out = new PrintWriter(System.out);
        sc = new Scanner(in);
        long time = System.currentTimeMillis();

        solve();

        out.flush();
        if (!customIN.isEmpty()) printOut(System.currentTimeMillis() - time + " ms");
        exit();
    }

    public static void main(String[] args) {
        new MainTemplate().run();
    }

    private int readInt() {
        return sc.nextInt();
    }

    private int[] readInt(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = readInt();
        return arr;
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

    public static <T> void printArray(T[] arr) {
        for (T i : arr)
            System.out.print(i + " ");
        System.out.println();
    }

    private void exit() { out.close(); System.exit(0); }
}